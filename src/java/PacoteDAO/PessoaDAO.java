package PacoteDAO;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.Model.Pessoa;

public class PessoaDAO {
    private static PessoaDAO instance;
    private Statement comando;

    public static PessoaDAO getInstance() {
        return instance == null ? instance = new PessoaDAO() : instance;
    }
    public PessoaDAO() { super(); }



    public void save(Pessoa entity) {
        Connection con = null;
        try {
            con = BaseDAO.getConexaoMySQL();
            String s = "INSERT INTO nomePessoa, sobrenomePessoa, dtNascPessoa, cpfPessoa, loginPessoa, senhaPessoa, celularPessoa, emailPessoa, celular2Pessoa) VALUES( '"+entity.getNome()+"','"+entity.getSobrenome()+"','"+entity.getDt_nascimento()+"','"+entity.getCpf()+"','"+entity.getLogin()+"','"+entity.getSenha()+"','"+entity.getNo_Celular()+"','"+entity.getEmail()+"','"+entity.getCelular2()+"';";
            getComando().executeQuery(s);
            String update_sql = "UPDATE Pessoa SET nomePessoa = '"+entity.getNome()+"','"+entity.getSobrenome()+"','"+entity.getDtNascimento()+"','"+entity.Cpf()+"','"+entity.getLogin()+"','"+entity.getSenha()+"','"+entity.getCelular()+"','"+entity.getEmail()"','"+entity.getCelular2()+"';";
            getComando().executeQuery(update_sql);
        } catch (SQLException e) {
            throw new DAOException("Operação não realizada com sucesso.", e);
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                throw new DAOException("Não foi possível fechar a conexão.",e);
            }
        }
    }
    public void delete(Pessoa p) {
        Connection con = null;
        try {
            con = BaseDAO.getConexaoMySQL();
            String sql = "DELETE FROM Pessoa where id = "+p.getId();
            comando.executeQuery(sql);
        } catch (SQLException e) {
            throw new DAOException("Operação não realizada com sucesso.", e);
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                throw new DAOException("Não foi possível fechar a conexão.",e);
            }
        }
    }

    public Pessoa find(String nome) {
        //public Pessoa find(String nome){
        Connection con = null;
        Pessoa cl = null;
        try {
            con = BaseDAO.getConexaoMySQL();
            ResultSet rs = comando.executeQuery("SELECT nomePessoa, sobrenomePessoa, dtNascPessoa, cpfPessoa, loginPessoa, senhaPessoa, Endereco_idEndereco, celularPessoa, emailPessoa, celular2Pessoa from Pessoa WHERE nomePessoa LIKE('%"+nome+"%');");
            if (rs.next()) {
                cl = map(rs);
            }
        } catch (SQLException e) {
            throw new DAOException("Operação não realizada com sucesso.", e);
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                throw new DAOException("Não foi possível fechar a conexão.",e);
            }
        }
        return cl;
    }

    private Pessoa map(ResultSet rs) throws SQLException {
        Pessoa cl = new Pessoa();
        cl.setNomePessoa(rs.getString("nomePessoa"));
        cl.setSobrenomePessoa(rs.getString("sobrenomePessoa"));
        cl.setDtNascPessoa(rs.getDate("dtNascPessoa"));
        cl.setLoginPessoa(rs.getString("loginPessoa"));
        cl.setSenhaPessoa(rs.getString("senhaPessoa"));
        cl.setEndereco_idEndereco(rs.getInt("Endereco_idEndereco"));
        cl.setCelularPessoa(rs.getString("celularPessoa"));
        cl.setEmailPessoa(rs.getString("emailPessoa"));
        cl.setCelular2Pessoa(rs.getString("celularPessoa"));

        return cl;
    }

    public boolean adicionarEndereco(ResultSet rs) throws SQLException{
        Endereco e = new Endereco();
        e.setRua(rs.getString("ruaEndereco"));
        e.setNumero(rs.getString("numEndereco"));
        e.setBairro(rs.getString("bairroEndereco"));
        e.setComplemento(rs.getString("complementoEndereco"));
        e.setEstado(rs.getString("estadoEndereco"));
        e.setCep(rs.getString("cepEndereco"));

        return true;
    }

    public void deleteEndereco(int id) {
        Connection con = null;
        try {
            con = ConnectionFactory.getConnection();
            String sql = "delete from Endereco where id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            pst.executeUpdate();
        } catch (SQLException e) {
            throw new DAOException("Operação não realizada com sucesso.", e);
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                throw new DAOException("Não foi possível fechar a conexão.",e);
            }
        }
    }

    public Statement getComando() {
        return comando;
    }

/*
	public List<Cliente> find() {

		Connection con = null;
		List<Cliente> result = null;

		try {
			con = ConnectionFactory.getConnection();
			PreparedStatement pst;
			String sql = "select id, cpf, nome, fone, renda from clientes";
			pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			result = new ArrayList<Cliente>();
			while (rs.next()) {
				Cliente cl = map(rs);
				result.add(cl);
			}
		} catch (SQLException e) {
			throw new DAOException("Operação não realizada com sucesso.", e);
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException e) {
				throw new DAOException("Não foi possível fechar a conexão.",e);
			}
		}
		return result;
	}

	public Cliente findByCpf(String cpf) {
		Connection con = null;
		Cliente cl = null;
		try {
			con = ConnectionFactory.getConnection();
			PreparedStatement pst;
			String sql = "select id, cpf, nome, fone, renda from clientes where cpf = ?";
			pst = con.prepareStatement(sql);
			pst.setString(1, cpf);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				cl = map(rs);
			}
		} catch (SQLException e) {
			throw new DAOException("Operação não realizada com sucesso.", e);
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException e) {
				throw new DAOException("Não foi possível fechar a conexão.",e);
			}
		}
		return cl;
	}

	public List<Cliente> findByNome(String str) {
		Connection con = null;
		List<Cliente> result = null;
		try {
			con = ConnectionFactory.getConnection();
			PreparedStatement pst;
			String sql = "select id, cpf, nome, fone, renda from clientes where upper(nome) like ?";
			pst = con.prepareStatement(sql);
			pst.setString(1, "%" + str.toUpperCase() + "%");
			ResultSet rs = pst.executeQuery();
			result = new ArrayList<Cliente>();
			while (rs.next()) {
				Cliente cl = map(rs);
				result.add(cl);
			}
		} catch (SQLException e) {
			throw new DAOException("Operação não realizada com sucesso.", e);
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException e) {
				throw new DAOException("Não foi possível fechar a conexão.",e);
			}
		}
		return result;
	}
}
