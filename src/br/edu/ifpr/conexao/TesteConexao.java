package br.edu.ifpr.conexao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TesteConexao {
	public static void main(String[] args) {
		ArrayList<Aluno> alunos = buscarAlunos();
		
		ArrayList<Curso> cursos = buscarCursos();
		
		for (Aluno aluno : alunos) {
			System.out.println("Nome: " + aluno.getNome());
		}
		
		System.out.println();
		
		for (Curso curso : cursos) {
			System.out.println("Nome: " + curso.getNome());
		}
		
	}	
    public static ArrayList<Aluno> buscarAlunos() {
        ArrayList<Aluno> listaParaRetorno = new ArrayList<>();
        String sql = "SELECT * FROM tb_aluno";

        try {
            PreparedStatement preparacaoDaInstrucao = Conexao.getConexao().prepareStatement(sql);
            ResultSet resultado = preparacaoDaInstrucao.executeQuery();

            while (resultado.next()) {
                Aluno alu = transformaResultSetEmAluno(resultado);
                listaParaRetorno.add(alu);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

        return listaParaRetorno;
    }
    
    public static ArrayList<Curso> buscarCursos() {
        ArrayList<Curso> listaParaRetorno = new ArrayList<>();
        String sql = "SELECT * FROM tb_curso";

        try {
            PreparedStatement preparacaoDaInstrucao = Conexao.getConexao().prepareStatement(sql);
            ResultSet resultado = preparacaoDaInstrucao.executeQuery();

            while (resultado.next()) {
                Curso curso = transformaResultSetEmCurso(resultado);
                listaParaRetorno.add(curso);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

        return listaParaRetorno;
    }
    
	public static Aluno transformaResultSetEmAluno(ResultSet resultado) throws SQLException {
        Aluno aluno = new Aluno();
        try {
            aluno.setIdAluno(resultado.getInt("id_aluno"));
            aluno.setNome(resultado.getString("nome"));
            return aluno;
        } catch (SQLException ex) {
            throw new SQLException("Erro na Transformação");
        }
    }
	
	public static Curso transformaResultSetEmCurso(ResultSet resultado) throws SQLException {
        Curso curso = new Curso();
        try {
            curso.setIdCurso(resultado.getInt("id_curso"));
            curso.setNome(resultado.getString("nome"));
            return curso;
        } catch (SQLException ex) {
            throw new SQLException("Erro na Transformação");
        }
    }
	
	
	
}
