package Task_3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Guest {
    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private Integer tableId;

    @Getter
    @Setter
    boolean hasReservation;

}
