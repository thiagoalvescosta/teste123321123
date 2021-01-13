package autoinc.dao;

import autoinc.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*;


/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("Autoinc2DAO")
@Transactional(transactionManager="autoinc-TransactionManager")
public interface Autoinc2DAO extends JpaRepository<Autoinc2, java.lang.Integer> {

}
