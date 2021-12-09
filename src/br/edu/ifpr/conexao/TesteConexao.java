package br.edu.ifpr.conexao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TesteConexao {
	public static void main(String[] args) {
		ArrayList<Aluno> alunos = buscarAlunos();
		
		for (Aluno aluno : alunos) {
			System.out.println("Nome: " + aluno.getNome());
		}
	}	
    public static ArrayList<Aluno> buscarAlunos() {
        ArrayList<Aluno> listaParaRetorno = new ArrayList<>();
        String sql = "SELECT * FROM tb_aluno";

        try {
            PreparedStatement preparacaoDaInstrucao = Conexao.getConexao().prepareStatement(sql);
            ResultSet resultado = preparacaoDaInstrucao.executeQuery();

            while (resultado.next()) {
                Aluno alu = transformaResultSetEmObjeto(resultado);
                listaParaRetorno.add(alu);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

        return listaParaRetorno;
    }
	private static Aluno transformaResultSetEmObjeto(ResultSet resultado) throws SQLException {
        Aluno aluno = new Aluno();
        try {
            aluno.setIdAluno(resultado.getInt("id_aluno"));
            aluno.setNome(resultado.getString("nome"));
            return aluno;
        } catch (SQLException ex) {
            throw new SQLException("Erro na Transformação");
        }
    }
	
}
