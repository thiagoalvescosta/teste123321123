package thiago.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
    import cronapi.CronapiByteHeaderSignature;


/**
* Classe que representa a tabela CLASS2
* @generated
*/
@Entity
@Table(name = "\"CLASS2\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("thiago.entity.Class2")
public class Class2 implements Serializable {

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
    @ManyToOne
    @JoinColumn(name="fk_class1", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private Class1 class1;

    /**
    * @generated
    */
    @Column(name = "attribute03", nullable = true, unique = false, insertable=true, updatable=true)
        
        private byte[] attribute03;

    /**
    * @generated
    */
    @Column(name = "attribute04", nullable = true, unique = false, insertable=true, updatable=true)
    @CronapiByteHeaderSignature
        
        private byte[] attribute04;

    /**
    * Construtor
    * @generated
    */
    public Class2(){
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
    public Class2 setId(java.lang.String id){
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
    public Class2 setAttribute01(java.lang.String attribute01){
        this.attribute01 = attribute01;
        return this;
    }
    /**
    * Obtém class1
    * return class1
    * @generated
    */
    
    public Class1 getClass1(){
        return this.class1;
    }

    /**
    * Define class1
    * @param class1 class1
    * @generated
    */
    public Class2 setClass1(Class1 class1){
        this.class1 = class1;
        return this;
    }
    /**
    * Obtém attribute03
    * return attribute03
    * @generated
    */
    
    public byte[] getAttribute03(){
        return this.attribute03;
    }

    /**
    * Define attribute03
    * @param attribute03 attribute03
    * @generated
    */
    public Class2 setAttribute03(byte[] attribute03){
        this.attribute03 = attribute03;
        return this;
    }
    /**
    * Obtém attribute04
    * return attribute04
    * @generated
    */
    
    public byte[] getAttribute04(){
        return this.attribute04;
    }

    /**
    * Define attribute04
    * @param attribute04 attribute04
    * @generated
    */
    public Class2 setAttribute04(byte[] attribute04){
        this.attribute04 = attribute04;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Class2 object = (Class2)obj;
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