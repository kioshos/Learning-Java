package Task_3;

import lombok.*;

@AllArgsConstructor
public class Table {

    @Getter
    @Setter
    boolean isOccupied;

    @Getter
    @Setter
    boolean isReserved;

    @Getter
    @Setter
    int id;

}
