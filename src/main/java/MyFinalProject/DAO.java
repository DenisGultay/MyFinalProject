/**@author Користувач
 * Interface for working with databases
 * Use generics.
 */

package MyFinalProject;

import java.util.List;

public interface DAO<T> {

    /**Method added entities (T t) in the dataBase;
     * @param t - depends on the implementation(user, room or hotel);
     * @return true - if (T t) successfully added in dataBase;
     *         false - if not added;
     */
    boolean add(T t);

    /**Method for editing entities (T t) field values;
     *Fields depends on the implementation(user, room or hotel);
     * @param t - depends on the implementation(user, room or hotel);
     * @return true - if (T t) successfully edited;
     *         false - if not edited;
     */
    boolean edit(T t);

    /**Method remove entities (T t) from the dataBase;
     * @param t - depends on the implementation(user, room or hotel);
     * @return true - if (T t) successfully removed;
     *         false - if not removed;
     */
    boolean remove(T t);

    /**Get lists of entities (T t) that are stored in the dataBase;
     * @return list of entities (T) from dataBase;
     */
    List<T> getBase();

}
