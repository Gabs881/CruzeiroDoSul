// Essa classe criará a entidade Manager que serve como Gestor 
// Logar e gerenciar as outras entidades dentro do menu.
// Tem atributos de Person e os dados de Login e Senha

import java.util.List;
import java.util.Objects;

public class Manager extends Person{
    private String login = "admin";
    private String password = "admin";

    public Manager( String name, String cpf, String tel, String login, String password){
        super(name, cpf, tel);
        this.login = login;
        this.password = password;
    }

    public Manager(){}

    public String getLogin() {
        return login;
    }

    public String getPassword(){
        return password;
    }

    public boolean tryLogin(List<Manager> managers, String enteredLogin, String enteredPassword){
        // verifica se o Login e senha estão corretos
        for (Manager manager : managers){
            if (manager.getLogin().equals(enteredLogin) && manager.getPassword().equals(enteredPassword)) {
                return true;
            }
        }
        return false;
    }

// Caso haja sobrecarga do operador == 

    public boolean equals(Object obj) {
        if (obj instanceof Manager other) {
            return Objects.equals(cpf, other.cpf);
        }
        return false;
    }
}

    