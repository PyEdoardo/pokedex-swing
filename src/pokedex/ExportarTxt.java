package pokedex;

import org.json.*;
import java.util.List;
import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExportarTxt {
    private String tipoPesquisa;
    private String pesquisa;
    private ConsumirAPI pokemonData;

    public ExportarTxt(String tipoPesquisa, String pesquisa) {
        this.tipoPesquisa = tipoPesquisa;
        this.pesquisa = pesquisa;
        this.pokemonData = new ConsumirAPI(tipoPesquisa, pesquisa);
    }

    private class Atributos {
        String nome = pokemonData.getName();
        double peso = pokemonData.getWeight();
        List<String> movimentos = pokemonData.getMoves();
        List<String> tipos = pokemonData.getTypes();

        public String retornoNome() {
            System.out.println("Nome: " + nome);
            return nome;
        }

        public double retornoPeso() {
            System.out.println("Peso: " + peso);
            return peso;
        }

        public List<String> retornoTipos() {
            System.out.println("Tipos: " + tipos);
            return tipos;
        }

        public List<String> retornoMovimentos() {
            System.out.println("Movimentos: " + movimentos);
            return movimentos;
        }
    }

    public void salvarTxt() {
        Atributos atributos = new Atributos();

        String nome = atributos.retornoNome();
        double peso = atributos.retornoPeso();
        List<String> tipos = atributos.retornoTipos();
        List<String> movimentos = atributos.retornoMovimentos();

        if (nome == null || tipos == null || movimentos == null) {
            JOptionPane.showMessageDialog(null, "Erro: dados não encontrados.");
            return;
        }

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("nome", nome);
        jsonObject.put("peso", peso);

        JSONObject tiposJson = new JSONObject();
        for (int i = 0; i < tipos.size(); i++) {
            tiposJson.put("tipo" + (i + 1), tipos.get(i));
        }
        jsonObject.put("tipos", tiposJson);

        jsonObject.put("movimentos", movimentos);

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