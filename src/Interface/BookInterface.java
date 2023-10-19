package Interface;

import Book.Book;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */ /**
 *
 * @author Ashley Mendoza V
 */
public interface BookInterface {

    /**
     * Agrega un libro a la colección.
     *
     * @param book El libro que se agregará a la colección.
     * @return El libro agregado.
     */
    public Book addBook(Book book);

    /**
     * Elimina un libro de la colección.
     *
     * @param book El libro que se eliminará de la colección.
     * @return El libro eliminado.
     */
    public Book deleteBook(Book book);

  
}
