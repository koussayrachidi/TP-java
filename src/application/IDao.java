package application;


import java.util.List;
public interface IDao<T> {
boolean  create(T o);

List<User> findAll();

User findByNom(String nom);


boolean delete(User o);



List<User> findAllNom(String nom);





}
