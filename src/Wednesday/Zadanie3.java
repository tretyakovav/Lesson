package Wednesday;

public class Zadanie3 {
    Declension declension = new Declension();
    IParse parse = declension.parse("Соединенные Штаты Америки (США)");
    String form = parse.getForm(Case.Gen, false);
    assertEquals("Соединенных Штатов Америки (США)", form);
    }
}
