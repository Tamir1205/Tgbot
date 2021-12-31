import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.ParseMode;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import java.util.ArrayList;
import java.util.List;

public class MyTelegramBot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        Menu menu = new Menu();
        Burgers burgers = new Burgers();
        Beverages beverages = new Beverages();
        Fries fries = new Fries();
        CalculatingTheTotalPrice calculatingTheTotalPrice = new CalculatingTheTotalPrice();

        if (update.hasMessage()) {
            Message message = update.getMessage();
            if (message.hasText()) {
                String text = message.getText();
                if (text.equals("/start")) {
                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setText("Choose food:");
                    sendMessage.setParseMode(ParseMode.MARKDOWN);
                    sendMessage.setChatId(String.valueOf(message.getChatId()));
                    calculatingTheTotalPrice.restart();

                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true);
                    List<KeyboardRow> keyboardRowList = new ArrayList<>();
                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();
                    KeyboardButton keyboardButton3 = new KeyboardButton();
                    KeyboardButton keyboardButton4 = new KeyboardButton();
                    KeyboardButton keyboardButton5 = new KeyboardButton();
                    keyboardButton1.setText(menu.getMenu()[0]);
                    keyboardButton2.setText(menu.getMenu()[1]);
                    keyboardButton3.setText(menu.getMenu()[2]);
                    keyboardButton4.setText(menu.getMenu()[3]);
                    keyboardButton5.setText(menu.getMenu()[4]);
                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRow1.add(keyboardButton3);
                    keyboardRow2.add(keyboardButton4);
                    keyboardRow2.add(keyboardButton5);
                    keyboardRowList.add(keyboardRow1);
                    keyboardRowList.add(keyboardRow2);
                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException E) {
                        E.printStackTrace();
                    }
                } else if (text.equals(menu.getMenu()[0])) {
                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setText("Choose a burger:");
                    sendMessage.setParseMode(ParseMode.MARKDOWN);
                    sendMessage.setChatId(String.valueOf(message.getChatId()));

                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true);
                    List<KeyboardRow> buttonRowList = new ArrayList<>();
                    KeyboardRow buttonsRow1 = new KeyboardRow();
                    KeyboardRow buttonsRow2 = new KeyboardRow();
                    KeyboardButton button1 = new KeyboardButton();
                    KeyboardButton button2 = new KeyboardButton();
                    KeyboardButton button3 = new KeyboardButton();
                    button1.setText(burgers.getChickenBurger());
                    button2.setText(burgers.getBeefBurger());
                    button3.setText(menu.getMenu()[4]);
                    buttonsRow1.add(button1);
                    buttonsRow1.add(button2);
                    buttonsRow2.add(button3);
                    buttonRowList.add(buttonsRow1);
                    buttonRowList.add(buttonsRow2);
                    replyKeyboardMarkup.setKeyboard(buttonRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException E) {
                        E.printStackTrace();
                    }
                } else if (text.equals(menu.getMenu()[1])) {
                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setText("Choose a beverage:");
                    sendMessage.setParseMode(ParseMode.MARKDOWN);
                    sendMessage.setChatId(String.valueOf(message.getChatId()));

                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true);
                    List<KeyboardRow> buttonRowList = new ArrayList<>();
                    KeyboardRow buttonsRow1 = new KeyboardRow();
                    KeyboardRow buttonsRow2 = new KeyboardRow();
                    KeyboardButton button1 = new KeyboardButton();
                    KeyboardButton button2 = new KeyboardButton();
                    KeyboardButton button3 = new KeyboardButton();
                    KeyboardButton button4 = new KeyboardButton();
                    button1.setText(beverages.getCoke());
                    button2.setText(beverages.getSprite());
                    button3.setText(beverages.getFanta());
                    button4.setText(menu.getMenu()[4]);
                    buttonsRow1.add(button1);
                    buttonsRow1.add(button2);
                    buttonsRow1.add(button3);
                    buttonsRow2.add(button4);
                    buttonRowList.add(buttonsRow1);
                    buttonRowList.add(buttonsRow2);
                    replyKeyboardMarkup.setKeyboard(buttonRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException E) {
                        E.printStackTrace();
                    }
                } else if (text.equals(menu.getMenu()[2])) {
                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setText("Choose a fry:");
                    sendMessage.setParseMode(ParseMode.MARKDOWN);
                    sendMessage.setChatId(String.valueOf(message.getChatId()));

                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true);
                    List<KeyboardRow> buttonRowList = new ArrayList<>();
                    KeyboardRow buttonsRow1 = new KeyboardRow();
                    KeyboardRow buttonsRow2 = new KeyboardRow();
                    KeyboardButton button1 = new KeyboardButton();
                    KeyboardButton button2 = new KeyboardButton();
                    button1.setText(fries.getFrenchFries());
                    button2.setText(menu.getMenu()[4]);
                    buttonsRow1.add(button1);
                    buttonsRow2.add(button2);
                    buttonRowList.add(buttonsRow1);
                    buttonRowList.add(buttonsRow2);
                    replyKeyboardMarkup.setKeyboard(buttonRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException E) {
                        E.printStackTrace();
                    }
                } else if (text.equals(menu.getMenu()[3])) {
                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setText("Your total price - " + calculatingTheTotalPrice.getTotalPrice() + " tg" + "\n" + "Your Order Will be Delivered!" + "\n" + "Bye");
                    sendMessage.setParseMode(ParseMode.MARKDOWN);
                    sendMessage.setChatId(String.valueOf(message.getChatId()));

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException E) {
                        E.printStackTrace();
                    }
                } else if (text.equals(menu.getMenu()[4])) {
                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setText("Your order is cancelled" + "\n" + "Total price - " + 0 + " tg");
                    sendMessage.setParseMode(ParseMode.MARKDOWN);
                    sendMessage.setChatId(String.valueOf(message.getChatId()));

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException E) {
                        E.printStackTrace();
                    }
                } else if (text.equals(burgers.getChickenBurger())) {
                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setText("Choose food:");
                    sendMessage.setParseMode(ParseMode.MARKDOWN);
                    sendMessage.setChatId(String.valueOf(message.getChatId()));
                    calculatingTheTotalPrice.setTotalPrice(burgers.burgerPriceList()[0]);

                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true);
                    List<KeyboardRow> buttonRowList = new ArrayList<>();
                    KeyboardRow buttonsRow1 = new KeyboardRow();
                    KeyboardRow buttonsRow2 = new KeyboardRow();
                    KeyboardButton button1 = new KeyboardButton();
                    KeyboardButton button2 = new KeyboardButton();
                    KeyboardButton button3 = new KeyboardButton();
                    KeyboardButton button4 = new KeyboardButton();
                    KeyboardButton button5 = new KeyboardButton();
                    button1.setText(menu.getMenu()[0]);
                    button2.setText(menu.getMenu()[1]);
                    button3.setText(menu.getMenu()[2]);
                    button4.setText(menu.getMenu()[3]);
                    button5.setText(menu.getMenu()[4]);
                    buttonsRow1.add(button1);
                    buttonsRow1.add(button2);
                    buttonsRow1.add(button3);
                    buttonsRow2.add(button4);
                    buttonsRow2.add(button5);
                    buttonRowList.add(buttonsRow1);
                    buttonRowList.add(buttonsRow2);
                    replyKeyboardMarkup.setKeyboard(buttonRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException E) {
                        E.printStackTrace();
                    }
                } else if (text.equals(burgers.getBeefBurger())) {
                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setText("Choose food:");
                    sendMessage.setParseMode(ParseMode.MARKDOWN);
                    sendMessage.setChatId(String.valueOf(message.getChatId()));
                    calculatingTheTotalPrice.setTotalPrice(burgers.burgerPriceList()[1]);

                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true);
                    List<KeyboardRow> buttonRowList = new ArrayList<>();
                    KeyboardRow buttonsRow1 = new KeyboardRow();
                    KeyboardRow buttonsRow2 = new KeyboardRow();
                    KeyboardButton button1 = new KeyboardButton();
                    KeyboardButton button2 = new KeyboardButton();
                    KeyboardButton button3 = new KeyboardButton();
                    KeyboardButton button4 = new KeyboardButton();
                    KeyboardButton button5 = new KeyboardButton();
                    button1.setText(menu.getMenu()[0]);
                    button2.setText(menu.getMenu()[1]);
                    button3.setText(menu.getMenu()[2]);
                    button4.setText(menu.getMenu()[3]);
                    button5.setText(menu.getMenu()[4]);
                    buttonsRow1.add(button1);
                    buttonsRow1.add(button2);
                    buttonsRow1.add(button3);
                    buttonsRow2.add(button4);
                    buttonsRow2.add(button5);
                    buttonRowList.add(buttonsRow1);
                    buttonRowList.add(buttonsRow2);
                    replyKeyboardMarkup.setKeyboard(buttonRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException E) {
                        E.printStackTrace();
                    }
                } else if (text.equals(beverages.getCoke())) {
                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setText("Choose food:");
                    sendMessage.setParseMode(ParseMode.MARKDOWN);
                    sendMessage.setChatId(String.valueOf(message.getChatId()));
                    calculatingTheTotalPrice.setTotalPrice(beverages.beveragesPriceList()[0]);

                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true);
                    List<KeyboardRow> buttonRowList = new ArrayList<>();
                    KeyboardRow buttonsRow1 = new KeyboardRow();
                    KeyboardRow buttonsRow2 = new KeyboardRow();
                    KeyboardButton button1 = new KeyboardButton();
                    KeyboardButton button2 = new KeyboardButton();
                    KeyboardButton button3 = new KeyboardButton();
                    KeyboardButton button4 = new KeyboardButton();
                    KeyboardButton button5 = new KeyboardButton();
                    button1.setText(menu.getMenu()[0]);
                    button2.setText(menu.getMenu()[1]);
                    button3.setText(menu.getMenu()[2]);
                    button4.setText(menu.getMenu()[3]);
                    button5.setText(menu.getMenu()[4]);
                    buttonsRow1.add(button1);
                    buttonsRow1.add(button2);
                    buttonsRow1.add(button3);
                    buttonsRow2.add(button4);
                    buttonsRow2.add(button5);
                    buttonRowList.add(buttonsRow1);
                    buttonRowList.add(buttonsRow2);
                    replyKeyboardMarkup.setKeyboard(buttonRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException E) {
                        E.printStackTrace();
                    }
                } else if (text.equals(beverages.getSprite())) {
                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setText("Choose food:");
                    sendMessage.setParseMode(ParseMode.MARKDOWN);
                    sendMessage.setChatId(String.valueOf(message.getChatId()));
                    calculatingTheTotalPrice.setTotalPrice(beverages.beveragesPriceList()[1]);

                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true);
                    List<KeyboardRow> buttonRowList = new ArrayList<>();
                    KeyboardRow buttonsRow1 = new KeyboardRow();
                    KeyboardRow buttonsRow2 = new KeyboardRow();
                    KeyboardButton button1 = new KeyboardButton();
                    KeyboardButton button2 = new KeyboardButton();
                    KeyboardButton button3 = new KeyboardButton();
                    KeyboardButton button4 = new KeyboardButton();
                    KeyboardButton button5 = new KeyboardButton();
                    button1.setText(menu.getMenu()[0]);
                    button2.setText(menu.getMenu()[1]);
                    button3.setText(menu.getMenu()[2]);
                    button4.setText(menu.getMenu()[3]);
                    button5.setText(menu.getMenu()[4]);
                    buttonsRow1.add(button1);
                    buttonsRow1.add(button2);
                    buttonsRow1.add(button3);
                    buttonsRow2.add(button4);
                    buttonsRow2.add(button5);
                    buttonRowList.add(buttonsRow1);
                    buttonRowList.add(buttonsRow2);
                    replyKeyboardMarkup.setKeyboard(buttonRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException E) {
                        E.printStackTrace();
                    }
                } else if (text.equals(beverages.getFanta())) {
                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setText("Choose food:");
                    sendMessage.setParseMode(ParseMode.MARKDOWN);
                    sendMessage.setChatId(String.valueOf(message.getChatId()));
                    calculatingTheTotalPrice.setTotalPrice(beverages.beveragesPriceList()[2]);

                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true);
                    List<KeyboardRow> buttonRowList = new ArrayList<>();
                    KeyboardRow buttonsRow1 = new KeyboardRow();
                    KeyboardRow buttonsRow2 = new KeyboardRow();
                    KeyboardButton button1 = new KeyboardButton();
                    KeyboardButton button2 = new KeyboardButton();
                    KeyboardButton button3 = new KeyboardButton();
                    KeyboardButton button4 = new KeyboardButton();
                    KeyboardButton button5 = new KeyboardButton();
                    button1.setText(menu.getMenu()[0]);
                    button2.setText(menu.getMenu()[1]);
                    button3.setText(menu.getMenu()[2]);
                    button4.setText(menu.getMenu()[3]);
                    button5.setText(menu.getMenu()[4]);
                    buttonsRow1.add(button1);
                    buttonsRow1.add(button2);
                    buttonsRow1.add(button3);
                    buttonsRow2.add(button4);
                    buttonsRow2.add(button5);
                    buttonRowList.add(buttonsRow1);
                    buttonRowList.add(buttonsRow2);
                    replyKeyboardMarkup.setKeyboard(buttonRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException E) {
                        E.printStackTrace();
                    }
                } else if (text.equals(fries.getFrenchFries())) {
                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setText("Choose food:");
                    sendMessage.setParseMode(ParseMode.MARKDOWN);
                    sendMessage.setChatId(String.valueOf(message.getChatId()));
                    calculatingTheTotalPrice.setTotalPrice(fries.friesPriceList()[0]);

                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true);
                    List<KeyboardRow> buttonRowList = new ArrayList<>();
                    KeyboardRow buttonsRow1 = new KeyboardRow();
                    KeyboardRow buttonsRow2 = new KeyboardRow();
                    KeyboardButton button1 = new KeyboardButton();
                    KeyboardButton button2 = new KeyboardButton();
                    KeyboardButton button3 = new KeyboardButton();
                    KeyboardButton button4 = new KeyboardButton();
                    KeyboardButton button5 = new KeyboardButton();
                    button1.setText(menu.getMenu()[0]);
                    button2.setText(menu.getMenu()[1]);
                    button3.setText(menu.getMenu()[2]);
                    button4.setText(menu.getMenu()[3]);
                    button5.setText(menu.getMenu()[4]);
                    buttonsRow1.add(button1);
                    buttonsRow1.add(button2);
                    buttonsRow1.add(button3);
                    buttonsRow2.add(button4);
                    buttonsRow2.add(button5);
                    buttonRowList.add(buttonsRow1);
                    buttonRowList.add(buttonsRow2);
                    replyKeyboardMarkup.setKeyboard(buttonRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException E) {
                        E.printStackTrace();
                    }
                }
            }
        }
    }

    @Override
    public String getBotUsername() {
        return "Java_My_Telegram_Bot";
    }

    @Override
    public String getBotToken() {
        return "5062940461:AAHrHyCKA3ajxjcJhF0V2NGArTc5hF-hb1Q";
    }
}