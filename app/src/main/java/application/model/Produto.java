package application.model;


public class Produto {
    @Entity
    @Table(name="Produto")
    public class Produto {
        @Id
        private int id;
        private String titulo;
        private String descricao;

        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getTitulo() {
            return titulo;
        }
        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }
        public String getDescricao() {
            return descricao;
        }
        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

    }
}
