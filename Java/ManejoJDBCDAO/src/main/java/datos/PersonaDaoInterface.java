
package datos;

import domain.PersonaDTO;
import java.util.*;
import java.sql.*;


public interface PersonaDaoInterface {
    
    public int insert(PersonaDTO persona) throws SQLException;
    
    public int update (PersonaDTO perosna) throws SQLException;
    
    public int delete(PersonaDTO persona) throws SQLException;
    
    public List<PersonaDTO> select() throws SQLException;
    
}
