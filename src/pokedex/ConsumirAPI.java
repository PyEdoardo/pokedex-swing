package pokedex;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import javax.swing.JOptionPane;
public class ConsumirAPI {

    private String name;
    private List<String> types;
    private List<String> moves;
    private int weight;
    private String imageUrl;
    private List<String> soundUrls;
    private String geracao;

    public ConsumirAPI(String tipoPesquisa, String pesquisa) {
        types = new ArrayList<>();
        moves = new ArrayList<>();
        soundUrls = new ArrayList<>();
        fetchPokemonData(tipoPesquisa, pesquisa);
    }

    private void fetchPokemonData(String tipoPesquisa, String pesquisa) {
        OkHttpClient client = new OkHttpClient();

        String apiUrl = "https://pokeapi.co/api/v2/" + tipoPesquisa + "/" + pesquisa.toLowerCase();

        Request request = new Request.Builder()
                .url(apiUrl)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (response.isSuccessful()) {
                String jsonData = response.body().string();

                JSONObject jsonObject = new JSONObject(jsonData);

                // Nome
                this.name = jsonObject.getString("name");

                // Tipos
                JSONArray typesArray = jsonObject.getJSONArray("types");
                for (int i = 0; i < typesArray.length(); i++) {
                    JSONObject typeObject = typesArray.getJSONObject(i).getJSONObject("type");
                    types.add(typeObject.getString("name"));
                }

                // Moves
                JSONArray movesArray = jsonObject.getJSONArray("moves");
                for (int i = 0; i < movesArray.length(); i++) {
                    JSONObject moveObject = movesArray.getJSONObject(i).getJSONObject("move");
                    moves.add(moveObject.getString("name"));
                }

                // Peso
                this.weight = jsonObject.getInt("weight");
                
                
                

                // URL da Imagem
                this.imageUrl = jsonObject.getJSONObject("sprites").getString("front_default");
                
                JSONObject criesObject = jsonObject.getJSONObject("cries"); // Supondo que "cries" seja o campo na API
                soundUrls.add(criesObject.getString("latest"));
                soundUrls.add(criesObject.getString("legacy"));

            } else {
                if(response.code() == 404){
                    JOptionPane.showMessageDialog(null, "Pokemon não encontrado!");
                }
                System.out.println("Erro na conexão: " + response.code());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public BufferedImage getImage() {
        try {
            OkHttpClient client = new OkHttpClient();

            Request request = new Request.Builder()
                    .url(imageUrl)
                    .build();

            try (Response response = client.newCall(request).execute()) {
                if (response.isSuccessful()) {
                    InputStream inputStream = response.body().byteStream();
                    return ImageIO.read(inputStream);
                } else {
                    System.out.println("Erro na conexão da imagem: " + response.code());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public List<String> getSoundUrls() {
        return soundUrls;
    }
    
    public List<String> getTypes() {
        return types;
    }

    public List<String> getMoves() {
        return moves;
    }

    public int getWeight() {
        return weight;
    }

    public String getImageUrl() {
        return imageUrl;
    }
    
    public String getGeracao(){
        return null;
    }
}