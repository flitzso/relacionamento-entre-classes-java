public class Teste {

    public static void main(String [] args) {

        Contato contato = new Contato();

        contato.setNome("Jack");
        //contato.setEndereco("LongBeach");
        //contato.setTelefone("00 00000-0000");

        //Relacionamento tem-um endereco
        Endereco end = new Endereco();
        end.setNomeRua("Rua: rua de venice");
        end.setNumero("n/a");
        end.setComplemento("-");
        end.setCidade("LongBeach");
        end.setEstados("California");
        end.setCep("00000-000");

        contato.setEndereco(end);

        //Relacionamento tem-um telefone
        Telefone telefone = new Telefone();
        telefone.setTipo("Celular");
        telefone.setDdd("11");
        telefone.setNumero("00000-0000");


        Telefone telefone2 = new Telefone();
        telefone2.setTipo("Casa");
        telefone2.setDdd("11");
        telefone2.setNumero("11111-2222");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;

        contato.setTelefones(telefones);

        //Teste saida no console
        System.out.println(contato.getNome());


        if (contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getCidade());
        }

        //if (contato != null && contato.getTelefone() != null) {
            //System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
        //}

        //Verificação de referencia a objeto If e se tiver mais do mesmo igual telefone use For junto
        if (contato != null && contato.getTelefones() != null){
            for (Telefone t : contato.getTelefones()){
                System.out.println(t.getDdd() + " " + t.getNumero());
            }
        }
    }
}
