package br.com.fiap.dao;

import br.com.fiap.dto.Carro;
import br.com.fiap.dto.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteDAO {
    private final Connection con;
    public ClienteDAO(Connection con){ this.con = con; }
    public Connection getCon() { return con; }

    public String inserir(Cliente cliente){
        final String sql = "INSERT INTO ddd_cliente (id_cliente, nome_cliente, placa) VALUES (?,?,?)";
        try (PreparedStatement ps = getCon().prepareStatement(sql)) {
            ps.setInt(1, cliente.getIdCliente());
            ps.setString(2, cliente.getNomeCliente());
            ps.setString(3, cliente.getPlaca());
            if (ps.executeUpdate() > 0){
                return "Inserido com sucesso";
            } else {
                return "Erro ao inserir";
            }
        } catch (SQLException e) {
            return "Erro de SQL (inserir): " + e.getMessage();
        }
    }

    public String alterar(Cliente cliente){
        final String sql = "UPDATE ddd_cliente SET nome_cliente = ?, placa = ? WHERE id_cliente = ?";
        try (PreparedStatement ps = getCon().prepareStatement(sql)) {
            ps.setString(1, cliente.getNomeCliente());
            ps.setString(2, cliente.getPlaca());
            ps.setInt(3, cliente.getIdCliente());
            if (ps.executeUpdate() > 0){
                return "Alterado com sucesso.";
            } else {
                return "Erro ao alterar";
            }
        } catch (SQLException e){
            return "Erro de SQL (alterar): " + e.getMessage();
        }
    }

    public String excluir(Cliente cliente){
        final String sql = "DELETE FROM ddd_cliente WHERE id_cliente = ?";
        try (PreparedStatement ps = getCon().prepareStatement(sql)) {
            ps.setInt(1, cliente.getIdCliente());
            if (ps.executeUpdate() > 0){
                return "Excluido com sucesso.";
            } else {
                return "Erro ao excluir";
            }
        } catch (SQLException e){
            return "Erro de SQL (excluir): " + e.getMessage();
        }
    }

    public ArrayList<Cliente> listarTodos(){
        final String sql = "SELECT cli.id_cliente, cli.nome_cliente, cli.placa, " +
                "car.descricao, car.cor " +
                "FROM ddd_cliente cli " +
                "LEFT JOIN ddd_carro car ON cli.placa = car.placa " +
                "ORDER BY cli.id_cliente";
        ArrayList<Cliente> listaCliente = new ArrayList<>();
        try (PreparedStatement ps = getCon().prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            if (rs != null){
                while (rs.next()){
                    Cliente c = new Cliente();
                    c.setIdCliente(rs.getInt(1));
                    c.setNomeCliente(rs.getString(2));
                    c.setPlaca(rs.getString(3));

                    Carro carro = new Carro();
                    carro.setPlaca(rs.getString("placa"));
                    carro.setDescricao(rs.getString("descricao"));
                    carro.setCor(rs.getString("cor"));

                    c.setCarro(carro);
                    listaCliente.add(c);
                }
                return listaCliente;
            } else {
                return null;
            }
        } catch (SQLException e){
            System.out.println("Erro de SQL (listar): " + e.getMessage());
            return null;
        }
    }
}