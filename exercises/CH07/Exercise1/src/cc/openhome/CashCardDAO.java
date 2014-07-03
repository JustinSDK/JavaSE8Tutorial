package cc.openhome;

public interface CashCardDAO {
    void save(CashCard cashCard);
    CashCard load(String number);
}
