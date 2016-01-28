package katta.potter;

import fj.F;
import fj.data.Option;

interface Discount<M> extends F<Basket<M>, Option<Integer>> {}
