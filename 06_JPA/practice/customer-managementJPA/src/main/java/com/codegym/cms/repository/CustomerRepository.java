package com.codegym.cms.repository;

import com.codegym.cms.model.Customer;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;


@Transactional
public class CustomerRepository implements ICustomerRepository{

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Customer> findAll() {
        TypedQuery<Customer> query = em.createQuery("SELECT c FROM Customer c", Customer.class);

        return query.getResultList();
    }

    @Override
    public Customer findById(Long id) {
        TypedQuery<Customer> query = em.createQuery("SELECT c FROM Customer c WHERE c.id = :id", Customer.class);
        query.setParameter("id", id);
        try {
            return query.getSingleResult();
        }catch (NoResultException e){
            return null;
        }
    }

    @Override
    public void save(Customer customer) {
        /*Nếu id tồn tài thì cập nhật(merge), còn không thì giữ nguyên lưu lại(persist)*/
        if(customer.getId() != null){
            em.merge(customer);
        }else {
            em.persist(customer);
        }
    }

    @Override
    public void remove(Long id) {
        /*Tìm theo id, nếu tồn tại thì Id thì xóa theo id*/
        Customer customer = findById(id);
        if(customer != null){
            em.remove(customer);
        }

    }
}
