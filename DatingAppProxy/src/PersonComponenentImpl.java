public class PersonComponenentImpl implements PersonComponent {
    String name;
    String gender;
    String interests;
    int ranking;
    int rankingNumber = 0;

    public PersonComponenentImpl(String name, String gender, String interests) {
        this.name = name;
        this.gender = gender;
        this.interests = interests;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public int getBeautyRanking() {
        if(rankingNumber == 0) return 0;
        return ranking/rankingNumber;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setGeneder(String gender) {
        this.gender = gender;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Override
    public void setBeautyRanking(int ranking) {
        this.ranking += ranking;
        rankingNumber++;
    }
}
