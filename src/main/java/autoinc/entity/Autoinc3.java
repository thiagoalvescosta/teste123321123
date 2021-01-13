package autoinc.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela AUTOINC3
* @generated
*/
@Entity
@Table(name = "\"AUTOINC3\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("autoinc.entity.Autoinc3")
public class Autoinc3 implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer id;

    /**
    * @generated
    */
    @Column(name = "attribute01", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String attribute01;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_autoinc2", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private Autoinc2 autoinc2;

    /**
    * Construtor
    * @generated
    */
    public Autoinc3(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    
    public java.lang.Integer getId(){
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Autoinc3 setId(java.lang.Integer id){
        this.id = id;
        return this;
    }
    /**
    * Obtém attribute01
    * return attribute01
    * @generated
    */
    
    public java.lang.String getAttribute01(){
        return this.attribute01;
    }

    /**
    * Define attribute01
    * @param attribute01 attribute01
    * @generated
    */
    public Autoinc3 setAttribute01(java.lang.String attribute01){
        this.attribute01 = attribute01;
        return this;
    }
    /**
    * Obtém autoinc2
    * return autoinc2
    * @generated
    */
    
    public Autoinc2 getAutoinc2(){
        return this.autoinc2;
    }

    /**
    * Define autoinc2
    * @param autoinc2 autoinc2
    * @generated
    */
    public Autoinc3 setAutoinc2(Autoinc2 autoinc2){
        this.autoinc2 = autoinc2;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Autoinc3 object = (Autoinc3)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}