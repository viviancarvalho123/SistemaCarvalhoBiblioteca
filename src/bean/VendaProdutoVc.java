package bean;
// Generated 17/09/2023 12:32:14 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * VendaProdutoVc generated by hbm2java
 */
@Entity
@Table(name="venda_produto_vc"
    ,catalog="db_vivian_carvalho"
)
public class VendaProdutoVc  implements java.io.Serializable {


     private int idvendaProdutoVc;
     private LeitoresVc leitoresVc;
     private LivroVc livroVc;
     private Date dataVendaVc;
     private String quantidadeVendida;

    public VendaProdutoVc() {
    }

    public VendaProdutoVc(int idvendaProdutoVc, LeitoresVc leitoresVc, LivroVc livroVc, Date dataVendaVc, String quantidadeVendida) {
       this.idvendaProdutoVc = idvendaProdutoVc;
       this.leitoresVc = leitoresVc;
       this.livroVc = livroVc;
       this.dataVendaVc = dataVendaVc;
       this.quantidadeVendida = quantidadeVendida;
    }
   
     @Id 

    
    @Column(name="idvenda_produto_vc", unique=true, nullable=false)
    public int getIdvendaProdutoVc() {
        return this.idvendaProdutoVc;
    }
    
    public void setIdvendaProdutoVc(int idvendaProdutoVc) {
        this.idvendaProdutoVc = idvendaProdutoVc;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="FK_leitores", nullable=false)
    public LeitoresVc getLeitoresVc() {
        return this.leitoresVc;
    }
    
    public void setLeitoresVc(LeitoresVc leitoresVc) {
        this.leitoresVc = leitoresVc;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="FK_livros", nullable=false)
    public LivroVc getLivroVc() {
        return this.livroVc;
    }
    
    public void setLivroVc(LivroVc livroVc) {
        this.livroVc = livroVc;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="data_venda_vc", nullable=false, length=10)
    public Date getDataVendaVc() {
        return this.dataVendaVc;
    }
    
    public void setDataVendaVc(Date dataVendaVc) {
        this.dataVendaVc = dataVendaVc;
    }

    
    @Column(name="quantidade_vendida", nullable=false, length=45)
    public String getQuantidadeVendida() {
        return this.quantidadeVendida;
    }
    
    public void setQuantidadeVendida(String quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }




}


