package katta.potter;

import fj.F;
import fj.data.HashMap;
import org.derive4j.Data;
import org.derive4j.FieldNames;
import org.derive4j.Flavour;

@Data(flavour = Flavour.FJ)
interface Basket<M> {

  <X> X match(@FieldNames("content") F<HashMap<M, Integer>, X> basket);

}
