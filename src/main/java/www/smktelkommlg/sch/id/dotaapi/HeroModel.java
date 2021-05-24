package www.smktelkommlg.sch.id.dotaapi;

public class HeroModel {
    private String heroname;
    private String heroattr;
    private String heroattack;
    private String heroimg;

    public HeroModel(String heroname, String heroattr, String heroattack, String heroimg) {
        this.heroname = heroname;
        this.heroattr = heroattr;
        this.heroattack = heroattack;
        this.heroimg = heroimg;
    }

    public String getHeroname() {
        return heroname;
    }

    public String getHeroattr() {
        return heroattr;
    }

    public String getHeroattack() {
        return heroattack;
    }

    public String getHeroimg() {
        return heroimg;
    }





}
