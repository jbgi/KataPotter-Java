package katta.potter;

import fj.F;
import fj.F2;
import fj.F3;
import fj.Hash;
import fj.data.HashMap;
import fj.data.List;
import fj.data.Stream;
import org.derive4j.Data;
import org.derive4j.FieldNames;
import org.derive4j.Flavour;
import org.derive4j.processor.P2;

import static katta.potter.Configs.getDiscounts;
import static katta.potter.Configs.getUnitPrices;
import static katta.potter.OrderEvaluators.getConfig;

@Data(flavour = Flavour.FJ) interface OrderEvaluator<M> {

  <X> X match(@FieldNames({ "config", "cache" }) F2<Config<M>, Cache<M>, X> evaluator);

  @Data(flavour = Flavour.FJ) interface Cache<M> {
    <X> X match(@FieldNames({ "priceCache" }) F<HashMap<Basket<M>, Integer>, X> cache);
  }

  @Data(flavour = Flavour.FJ) interface Config<M> {
    <X> X match(@FieldNames({ "unitPrices", "discounts", "hashing" }) F3<UnitPrices<M>, List<Discount<M>>, Hash<M>, X> config);
  }



}
