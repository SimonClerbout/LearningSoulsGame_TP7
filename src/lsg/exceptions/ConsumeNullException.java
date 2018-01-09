package lsg.exceptions;

import lsg.consumables.Consumable;

/**
 * Created by sclerbou on 21/12/17.
 */
public class ConsumeNullException extends ConsumeException {

    public ConsumeNullException(Consumable consumable){

        super("Consumable is Null!", consumable);

    }

}
