package br.edu.ifgoiano.barbearia.modelo.dto.enumeracoes;

/**
 *
 * @author roni
 */
public enum Servico {
    CORTE(1, "Corte"), 
    BARBA(2, "Barba"), 
    CORTE_MAIS_BARBA(3, "Corte e Barba");
    
    private Integer id;
    
    private String nome;

    private Servico(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    
    public static Servico get(int id){
        switch (id){
            case 1: return CORTE;
            case 2: return BARBA;
            case 3: return CORTE_MAIS_BARBA;
        }
        
        return null;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return getNome();
    }
}
