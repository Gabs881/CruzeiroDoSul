// Essa classe é Pai de outras 3 entidades, Manager, professor e estudante
//Ela vai coletar as informações de cada usúario

public class Person {
    protected String name;
    protected String cpf;
    protected String tel;

    public Person (String name, String cpf, String tel) {
        this.name = name;
        this.cpf = cpf;
        this.tel = tel;
    }

    public Person (){}

    public String getName () {
        return name;
    }

    public void setName (String name){
        this.name = name;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf (String cpf) {
        this.cpf = cpf;
    }

    public String getTel(){
        return tel;
    }
    public void setTel(String tel){
        this.tel = tel;
    }
}