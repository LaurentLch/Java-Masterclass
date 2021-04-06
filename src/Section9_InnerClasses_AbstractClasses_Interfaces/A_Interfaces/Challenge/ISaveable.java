package Section9_InnerClasses_AbstractClasses_Interfaces.A_Interfaces.Challenge;

import java.util.List;

/**
 * Created by dev on 30/09/15.
 */
public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);

}
