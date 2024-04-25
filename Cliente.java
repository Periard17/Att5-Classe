public class Cliente {
  private String nome;
  private String cpf;
  private String telefone;
  private String endereco;
  private String email;
  
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
  public String getTelefone() {
    return telefone;
  } 
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }
  public String getEndereco() {
    return endereco;
  } 
  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
    
class Funcionario {
  private String nome;
  private String cpf;
  private String telefone;
  private String endereco;
  private String email;
  private String cargo;

  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
  public String getTelefone() {
    return telefone;
  } 
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  } 
  public String getEndereco() {
    return endereco;
  } 
  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }
  public String getEmail() {
    return email;
  } 
  public void setEmail(String email) {
    this.email = email;
  } 
  public String getCargo() {
    return cargo;
  } 
  public void setCargo(String cargo) {
    this.cargo = cargo;
  }
}

class Produto {
  private String nomeprod;
  private String codigoprod;
  private String nomedocliente;
  private String telefonecliente;
  private String enderecocliente;
  private double valorprod;
  private int quantidadeprod;

  public String getNomeprod() {
    return nomeprod;
  } 
  public void setNomeprod(String nomeprod) {
    this.nomeprod = nomeprod;
  } 
  public String getCodigoprod() {
    return codigoprod;
  } 
  public void setCodigoprod(String codigoprod) {
    this.codigoprod = codigoprod;
  } 
  public String getNomedocliente() {
    return nomedocliente;
  } 
  public void setNomedocliente(String nomedocliente) {
    this.nomedocliente = nomedocliente;
  } 
  public String getTelefonecliente() {
    return telefonecliente;
  } 
  public void setTelefonecliente(String telefonecliente) {
    this.telefonecliente = telefonecliente;
  } 
  public String getEnderecocliente() {
    return enderecocliente;
  } 
  public void setEnderecocliente(String enderecocliente) {
    this.enderecocliente = enderecocliente;
  } 
  public double getValorprod() {
    return valorprod;
  } 
  public void setValorprod(double valorprod) {
    this.valorprod = valorprod;
  } 
  public int getQuantidadeprod() {
    return quantidadeprod;
  } 
  public void setQuantidadeprod(int quantidadeprod) {
    this.quantidadeprod = quantidadeprod;
  } 
  
}

class Venda {
  private String nomeprod;
  private String codigoprod;
  private double valorprod;
  private String nomedocliente;
  private String nomefuncionario;
  private double valortotal;
  private String metodopag;

  public String getNomeprod() {
    return nomeprod;
  } 
  public void setNomeprod(String nomeprod) {
    this.nomeprod = nomeprod;
  } 
  public String getCodigoprod() {
    return codigoprod;
  } 
  public void setCodigoprod(String codigoprod) {
    this.codigoprod = codigoprod;
  } 
  public double getValorprod() {
    return valorprod;
  } 
  public void setValorprod(double valorprod) {
    this.valorprod = valorprod;
  } 
  public String getNomedocliente() {
    return nomedocliente;
  } 
  public void setNomedocliente(String nomedocliente) {
    this.nomedocliente = nomedocliente;
  } 
  public String getNomefuncionario() {
    return nomefuncionario;
  } 
  public void setNomefuncionario(String nomefuncionario) {
    this.nomefuncionario = nomefuncionario;
  }
  public double getValortotal() {
    return valortotal;
  } 
  public void setValortotal(double valortotal) {
    this.valortotal = valortotal;
  } 
  public String getMetodopag() {
    return metodopag;
  } 
}
}
