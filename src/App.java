public class App {
    public static void main(String[] args) throws Exception {
        User user = new User();
        Aula aula = new Aula();

        System.out.println(user.getNome());
        System.out.println(user.getEmail());
        System.out.println(user.getSenha());
        System.out.println(user.getIdade());
        System.out.println(user.getAulasAssistidas());

        user.setNome("Audrey Costa");
        user.setEmail("audrey@gmail.com");
        user.setSenha("banana");
        user.setIdade(26);
        user.assistirAula();
        user.assistirAula();
        user.assistirAula();
        user.assistirAula();

        System.out.println(user.getNome());
        System.out.println(user.getEmail());
        System.out.println(user.getSenha());
        System.out.println(user.getIdade());
        System.out.println(user.getAulasAssistidas());

        user.setNovaSenha(user.getSenha(), "batata");
        user.setNovoEmail("audrey@yahoo.com", "banana");
        user.assistirAula();
        user.assistirAula();

        System.out.println(user.getNome());
        System.out.println(user.getEmail());
        System.out.println(user.getSenha());
        System.out.println(user.getIdade());
        System.out.println(user.getAulasAssistidas());

        System.out.println(user.responder());

        
        System.out.println(aula.getNomeDaAula());
        System.out.println(aula.getDuracao());
        System.out.println(aula.getRespostas()[1]);

        aula.setNomeDaAula("Iniciando em Java");
        aula.setDuracao(20.17);
        aula.setRespostas(user.responder());

        
        System.out.println(aula.getNomeDaAula());
        System.out.println(aula.getDuracao());
        System.out.println(aula.getRespostas()[1]);
    }
}
