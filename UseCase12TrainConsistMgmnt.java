// UC12: Safety Compliance Check for Goods Bogies

import java.util.ArrayList;
import java.util.List;

public class UseCase12TrainConsistMgmnt
{
    static class GoodsBogie
    {
        private String Type;
        private String cargo;

        GoodsBogie(String type, String cargo)
        {
            this.Type = type;
            this.cargo = cargo;
        }
    }

    public static void main(String[] args)
    {
        List<GoodsBogie> goodsBogies = new ArrayList<>();
        goodsBogies.add(new GoodsBogie("PASSENGER", "Passengers"));
        goodsBogies.add(new GoodsBogie("GOODS", "Coal"));
        goodsBogies.add(new GoodsBogie("GOODS", "Chemicals"));
    }
}