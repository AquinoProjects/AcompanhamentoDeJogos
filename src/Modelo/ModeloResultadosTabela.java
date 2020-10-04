/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author htaeaquino
 */
public class ModeloResultadosTabela extends AbstractTableModel {
    private List<Resultados>dados = new ArrayList<>();
    private String[] colunas = {"Jogo","Placar","Mín. Tem","Máx. Tem","Recorde Min.","Recorde Máx."};
    public String getColumnName(int column) {
        return colunas[column];
    }
   
            @Override
    public int getRowCount() {
       return dados.size(); //linhas da tabela
        
    }

    @Override
    public int getColumnCount() {
        return colunas.length; //Colunas da Tabela
        
    }

    @Override
    public Object getValueAt(int linha, int coluna) { //Pega os resultados da tabela
        switch(coluna) { 
            case 0:
                return dados.get(linha).getJogo();              
            case 1:
                return dados.get(linha).getPlacar();               
            case 2:
                return dados.get(linha).getMinTemporada();
            case 3:
                return dados.get(linha).getMaxTemporada();
            case 4:
                return dados.get(linha).getQuebraRecordeMin();
            case 5:
                return dados.get(linha).getQuebraRecordeMax();
            
                
            
        }
        return null;
    }
    //adiciona os dados a jtable.
    public void addRow(Resultados r){
        this.dados.add(r);
      this.fireTableDataChanged();
    }//remocao de uma selecionada linha da tablemodel
    public void removeRow(int linha){
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
        
    }
    
    {
    //To change body of generated methods, choose Tools | Templates.
    }
    
}
