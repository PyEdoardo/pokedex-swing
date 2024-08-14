/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokedex;
import pokedex.*;
import org.json.*;
import java.util.List;
import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExportarTxt {
    Pokedex retornoPesquisaTipo = new Pokedex();
    String tipoPesquisa = retornoPesquisaTipo.getTipoPesquisa();
    String pesquisa = retornoPesquisaTipo.getPesquisa();
    ConsumirAPI pokemonData = new ConsumirAPI(tipoPesquisa, pesquisa);

    private class Atributos {
        String nome = pokemonData.getName();
        double peso = pokemonData.getWeight();
        List<String> movimentos = pokemonData.getMoves();
        List<String> tipos = pokemonData.getTypes();
        public String retornoNome() {
            return nome;
        }

        public double retornoPeso() {
            return peso;
        }

        public List<String> retornoTipos() {
            return tipos;
        }

        public List<String> retornoMovimentos() {
            return movimentos;
        }
    }

    public void salvarTxt() {
        Atributos atributos = new Atributos();

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("nome", atributos.retornoNome());
        jsonObject.put("peso", atributos.retornoPeso());

        JSONObject tiposJson = new JSONObject();
        List<String> tipos = atributos.retornoTipos();
        for (int i = 0; i < tipos.size(); i++) {
            tiposJson.put("tipo" + (i + 1), tipos.get(i));
        }
        jsonObject.put("tipos", tiposJson);

        jsonObject.put("movimentos", atributos.retornoMovimentos());

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Salvar como");
        int userSelection = fileChooser.showSaveDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();

            try (FileWriter fileWriter = new FileWriter(fileToSave + ".txt")) {
                fileWriter.write(jsonObject.toString(4)); 
                JOptionPane.showMessageDialog(null, "Arquivo salvo com sucesso em: " + fileToSave.getAbsolutePath());
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar o arquivo: " + e.getMessage());
            }
        }
    }
}