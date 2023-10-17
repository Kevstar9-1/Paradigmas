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
     * Get the author.
     * @return The author.
     */
    Author getAuthor();

    /**
     * Get the title.
     * @return The title.
     */
    String getTitle();

    /**
     * Set the author.
     * @param author The author to set.
     */
    void setAuthor(Author author);

    /**
     * Set the title.
     * @param title The title to set.
     */
    void setTitle(String title);
}
