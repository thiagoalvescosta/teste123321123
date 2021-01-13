package bugx.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela BUG
* @generated
*/
@Entity
@Table(name = "\"BUG\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("bugx.entity.Bug")
public class Bug implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @Column(name = "attribute01", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String attribute01;

    /**
    * @generated
    */
    @Column(name = "inteiro", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer inteiro;

    /**
    * Construtor
    * @generated
    */
    public Bug(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    
    public java.lang.String getId(){
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Bug setId(java.lang.String id){
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
    public Bug setAttribute01(java.lang.String attribute01){
        this.attribute01 = attribute01;
        return this;
    }
    /**
    * Obtém inteiro
    * return inteiro
    * @generated
    */
    
    public java.lang.Integer getInteiro(){
        return this.inteiro;
    }

    /**
    * Define inteiro
    * @param inteiro inteiro
    * @generated
    */
    public Bug setInteiro(java.lang.Integer inteiro){
        this.inteiro = inteiro;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Bug object = (Bug)obj;
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