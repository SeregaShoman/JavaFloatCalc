import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


/*Кнопочки и дефолтное окошко */
public class window extends JFrame implements WindowListener, ActionListener{
    //private TextField f = new TextField()
    private TextField f = new TextField();
    private JButton b0 = new JButton("0");//Кнопочка 0
    private JButton b1 = new JButton("1");//Кнопочка 1
    private JButton b2 = new JButton("2");//Кнопочка 2
    private JButton b3 = new JButton("3");//Кнопочка 3
    private JButton b4 = new JButton("4");//Кнопочка 4
    private JButton b5 = new JButton("5");//Кнопочка 5
    private JButton b6 = new JButton("6");//Кнопочка 6
    private JButton b7 = new JButton("7");//Кнопочка 7
    private JButton b8 = new JButton("8");//Кнопочка 8
    private JButton b9 = new JButton("9");//Кнопочка 9
    private JButton Del = new JButton("C");//Кнопочка удаления
    private JButton result = new JButton("=");//Кнопочка результата
    private JButton ad = new JButton("+");//Кнопочка сложения
    private JButton eqw = new JButton("*");//Кнопочка умножения
    private JButton div = new JButton("/");//Кнопочка деления
    private JButton sq = new JButton("sqrt");//Кнопочка степень
    private JButton сhange = new JButton("+ / -");//Кнопочка смена знака
    private JButton sub = new JButton("-");//Кнопочка вычитания
    private JButton Cancel = new JButton("<=");//Кнопочка удаления символа
    private JButton fl = new JButton(".");//Кнопочка точки
    private JButton cr = new JButton("√");//Кнопочка корня
    private JButton fact = new JButton("!");//Кнопочка факториала
    private JButton pi = new JButton("P");//Кнопочка пи
    private String text = "";//Пустая переменная для накопления в текстовом поле
    private float a = 0;//Первая переменная для формул
    private float b = 0;//Вторая переменная для формул
    private int l = 65;//Первая переменная для формул
    private int m = 65;//Вторая переменная для формул
    private char z;//символ для проверки на то какой знак в методе равно
    public window(){
        //СДВИГ НА 80px
        //ДА ОКЕЙ Я МОГ СДЕЛАТЬ КОНСТРУКТОР НО НЕ СТАЛ
        Font ex = new Font("Impact", Font.BOLD, 40);//Шрифт
        setLayout(null);//Занулил слои
        setSize(370, 600);//Высота ширина
        setVisible(true);//Сделал видимым
        setLocation(700, 250);//То где открываеться окно калькулятора
        f.setFont(ex);//В форму задал шрифт
        f.setSize(330, 60);//Размер окна вывода
        f.setLocation(25,25);//Кординаты окна вывода
        f.setVisible(true);//Видимость окна вывода
        add(f);//Добавление окна вывода
        pi.setFont(ex);//Шрифт кнопочки
        pi.setSize(65, 32);//Размеры кнопочки sqrt
        pi.setLocation(265, 105);//Координаты кнопочки sqrt
        pi.setVisible(true);//Видимость кнопочки sqrt
        add(pi);//Добавление кнопочки sqrt
        pi.addActionListener(this);//Обработчик нажатия для проверки if
        //-----------------------------
        fact.setFont(ex);//Шрифт кнопочки
        fact.setSize(65, 32);//Размеры кнопочки sqrt
        fact.setLocation(185, 105);//Координаты кнопочки sqrt
        fact.setVisible(true);//Видимость кнопочки sqrt
        add(fact);//Добавление кнопочки sqrt
        fact.addActionListener(this);//Обработчик нажатия для проверки if
        //-----------------------------
        //sq.setFont(ex);//Шрифт кнопочки
        sq.setSize(65, 32);//Размеры кнопочки sqrt
        sq.setLocation(25, 105);//Координаты кнопочки sqrt
        sq.setVisible(true);//Видимость кнопочки sqrt
        add(sq);//Добавление кнопочки sqrt
        sq.addActionListener(this);//Обработчик нажатия для проверки if
        //-----------------------------
        cr.setFont(ex);//Шрифт кнопочки
        cr.setSize(65, 32);//Размеры кнопочки sqrt
        cr.setLocation(105, 105);//Координаты кнопочки sqrt
        cr.setVisible(true);//Видимость кнопочки sqrt
        add(cr);//Добавление кнопочки sqrt
        cr.addActionListener(this);//Обработчик нажатия для проверки if
        //-----------------------------
        fl.setFont(ex);//Шрифт кнопочки
        fl.setSize(l,m);//Размеры кнопочки sqrt
        fl.setLocation(185,465);//Координаты кнопочки sqrt
        fl.setVisible(true);//Видимость кнопочки sqrt
        add(fl);//Добавление кнопочки sqrt
        fl.addActionListener(this);//Обработчик нажатия для проверки if
        //-----------------------------
        eqw.setFont(ex);//Шрифт кнопочки
        eqw.setSize(l, m);//Размеры кнопочки *
        eqw.setLocation(185, 145);//Координаты кнопочки *
        eqw.setVisible(true);//Видимость кнопочки *
        add(eqw);//Добавление кнопочки *
        eqw.addActionListener(this);//Обработчик нажатия для проверки if
        //-----------------------------
        div.setFont(ex);//Шрифт кнопочки
        div.setSize(l, m);//Размеры кнопочки /
        div.setLocation(265, 145);//Координаты кнопочки /
        div.setVisible(true);//Видимость кнопочки /
        add(div);//Добавление кнопочки /
        div.addActionListener(this);//Обработчик нажатия для проверки if
        //-----------------------------
        //сhange.setFont(ex);//Шрифт кнопочки
        сhange.setSize(l, m);//Размеры кнопочки +/-
        сhange.setLocation(25, 465);//Координаты кнопочки +/-
        сhange.setVisible(true);//Видимость кнопочки +/-
        add(сhange);//Добавление кнопочки +/-
        сhange.addActionListener(this);//Обработчик нажатия для проверки if
        //-----------------------------
        b8.setFont(ex);//Шрифт кнопочки
        b8.setSize(l, m);//Размеры кнопочки 8
        b8.setLocation(105, 225);//Координаты кнопочки 8
        b8.setVisible(true);//Видимость кнопочки 8
        add(b8);//Добавление кнопочки 8
        b8.addActionListener(this);//Обработчик нажатия для проверки if
        b9.setFont(ex);//Шрифт кнопочки
        b9.setSize(l, m);//Размеры кнопочки 7
        b9.setLocation(25, 225);//Координаты кнопочки 7
        b9.setVisible(true);//Видимость кнопочки 7
        add(b9);//Добавление кнопочки 7
        b9.addActionListener(this);//Обработчик нажатия для проверки if
        //-----------------------------
        b7.setFont(ex);//Шрифт кнопочки
        b7.setSize(l, m);//Размеры кнопочки 9
        b7.setLocation(185, 225);//Координаты кнопочки 9
        b7.setVisible(true);//Видимость кнопочки 9
        add(b7);//Добавление кнопочки 9
        b7.addActionListener(this);//Обработчик нажатия для проверки if
        //-----------------------------
        b6.setFont(ex);//Шрифт кнопочки
        b6.setSize(l, m);//Размеры кнопочки 6
        b6.setLocation(25, 305);//Координаты кнопочки 6
        b6.setVisible(true);//Видимость кнопочки 6
        add(b6);//Добавление кнопочки 6
        b6.addActionListener(this);//Обработчик нажатия для проверки if
        //------------------------------
        b5.setFont(ex);//Шрифт кнопочки
        b5.setSize(l, m);//Размеры кнопочки 5
        b5.setLocation(105, 305);//Координаты кнопочки 5
        b5.setVisible(true);//Видимость кнопочки 5
        add(b5);//Добавление кнопочки 5
        b5.addActionListener(this);//Обработчик нажатия для проверки if
        //------------------------------
        b4.setFont(ex);//Шрифт кнопочки
        b4.setSize(l, m);//Размеры кнопочки 5
        b4.setLocation(185, 305);//Координаты кнопочки 5
        b4.setVisible(true);//Видимость кнопочки 5
        add(b4);//Добавление кнопочки 5
        b4.addActionListener(this);//Обработчик нажатия для проверки if
        //------------------------------
        //Cancel.setFont(ex);//Шрифт кнопочки
        Cancel.setSize(l, m);//Размеры кнопочки 
        Cancel.setLocation(265, 305);//Координаты кнопочки 
        Cancel.setVisible(true);//Видимость кнопочки 
        add(Cancel);//Добавление кнопочки 
        Cancel.addActionListener(this);//Обработчик нажатия для проверки if
        //------------------------------
        b3.setFont(ex);//Шрифт кнопочки
        b3.setSize(l, m);//Размеры кнопочки 3
        b3.setLocation(25, 385);//Координаты кнопочки 3
        b3.setVisible(true);//Видимость кнопочки 3
        add(b3);//Добавление кнопочки 3
        b3.addActionListener(this);//Обработчик нажатия для проверки if
        //------------------------------
        b2.setFont(ex);//Шрифт кнопочки
        b2.setSize(l, m);//Размеры кнопочки 2
        b2.setLocation(105, 385);//Координаты кнопочки 2
        b2.setVisible(true);//Видимость кнопочки 2
        add(b2);//Добавление кнопочки 2
        b2.addActionListener(this);//Обработчик нажатия для проверки if
        //------------------------------
        b1.setFont(ex);//Шрифт кнопочки
        b1.setSize(l, m);//Размеры кнопочки 1
        b1.setLocation(185, 385);//Координаты кнопочки 1
        b1.setVisible(true);//Видимость кнопочки 1
        add(b1);//Добавление кнопочки 1
        b1.addActionListener(this);//Обработчик нажатия для проверки if
        //------------------------------
        b0.setFont(ex);//Шрифт кнопочки
        b0.setSize(l, m);//Размеры кнопочки 0
        b0.setLocation(105, 465);//Координаты кнопочки 0
        b0.setVisible(true);//Видимость кнопочки 0
        add(b0);//Добавление кнопочки 0
        b0.addActionListener(this);//Обработчик нажатия для проверки if
        //------------------------------
        Del.setFont(ex);//Шрифт кнопочки
        Del.setSize(l, m);//Размеры кнопочки удаления
        Del.setLocation(265, 225);//Координаты кнопочки удаления
        Del.setVisible(true);//Видимость кнопочки удаления
        add(Del);//Добавление кнопочки удаления
        Del.addActionListener(this);//Обработчик нажатия для проверки if
        result.setFont(ex);//Шрифт кнопочки
        result.setSize(65, 155);//Размеры кнопочки =
        result.setLocation(265, 385);//Координаты кнопочки =
        result.setVisible(true);//Видимость кнопочки =
        add(result);//Добавление кнопочки =
        result.addActionListener(this);
        //-----------------------------
        ad.setFont(ex);//Шрифт кнопочки
        ad.setSize(l, m);//Размеры кнопочки +
        ad.setLocation(25, 145);//Координаты кнопочки +
        ad.setVisible(true);//Видимость кнопочки +
        add(ad);//Добавление кнопочки +
        ad.addActionListener(this);//Обработчик нажатия для проверки if
        //------------------------------
        sub.setFont(ex);//Шрифт кнопочки
        sub.setSize(l, m);//Размеры кнопочки -
        sub.setLocation(105, 145);//Координаты кнопочки -
        sub.setVisible(true);//Видимость кнопочки -
        add(sub);//Добавление кнопочки -
        sub.addActionListener(this);//Обработчик нажатия для проверки if


    }
 





    @Override
    public void actionPerformed(ActionEvent e) {
        //через геттер получаем событие нажатия кнопочки
        if (e.getSource()==pi){
            double x = Math.PI;
            f.setText(String.valueOf(x));//отображаю
            text = String.valueOf(x);//меняю переменную для след кнопок

        }
        if (e.getSource()==fact){
            float c = Float.parseFloat(f.getText());//получил число и приравнял к переменной
            long fact = 1;//Начала факториала
            for (int i = 2; i <= c; i++) {//Цикл для каждого елемента факториала
                fact = fact * i;//переменная факториала
            }
            f.setText(String.valueOf(fact));//отображаю
            text = String.valueOf(fact);//меняю переменную для след кнопок

        }
        if (e.getSource()==Cancel){
            //символы в строке не прикосновены и это трешомба
            StringBuffer c = new StringBuffer(f.getText());//Я делаю баффер и кидаю в него строку
            c.setLength(c.length() - 1);//Я получаю его длину и скоращаю на 1 символ
            f.setText(String.valueOf(c));//отображаю
            text = String.valueOf(c);//меняю переменную для след кнопок
        }
        if (e.getSource()==cr){
            Float c = Float.parseFloat(f.getText());//получил число и приравнял к переменной
            double a = c;//переменная к переменной другого формата
            double y = Math.sqrt(a);//корень вычисляю с помошью класса sqrt
            f.setText(String.valueOf(y));//отображаю
            text = String.valueOf(y);//меняю переменную для след кнопок
        }
        if (e.getSource()==сhange){
            Float c = Float.parseFloat(f.getText());//получил число и приравнял к переменной
            c = c/-1;//поделил его на -1 т.е сменил знак
            f.setText(String.valueOf(c));//отображаю
            text = String.valueOf(c);//меняю переменную для след кнопок
        }
        if (e.getSource()==sq){
            Float c = Float.parseFloat(f.getText());//получил число и приравнял к переменной
            c = c*c;//вау формула квадрата такая сложная я прям немогу её в коментарий описать
            f.setText(String.valueOf(c));//отображаю
            text = String.valueOf(c);//меняю переменную для след кнопок
        }
        if (e.getSource()==b9){
            text = text + b9.getText();//Та самая пустая переменная к которая добавляет числа = числу нажатий на кнопку
            f.setText(text);//Так же через геттер получаем текст кнопочки и добавляем через ссетер его в поле

        }
        if (e.getSource()==b7){
            text = text + b7.getText();//Та самая пустая переменная к которая добавляет числа = числу нажатий на кнопку
            f.setText(text);//Так же через геттер получаем текст кнопочки и добавляем через ссетер его в поле

        }
        if (e.getSource()==b8){
            text = text + b8.getText();//Та самая пустая переменная к которая добавляет числа = числу нажатий на кнопку
            f.setText(text);//Так же через геттер получаем текст кнопочки и добавляем через ссетер его в поле

        }
        if (e.getSource()==b6){
            text = text + b6.getText();//Та самая пустая переменная к которая добавляет числа = числу нажатий на кнопку
            f.setText(text);//Так же через геттер получаем текст кнопочки и добавляем через ссетер его в поле

        }
        if (e.getSource()==b5){
            text = text + b5.getText();//Та самая пустая переменная к которая добавляет числа = числу нажатий на кнопку
            f.setText(text);//Так же через геттер получаем текст кнопочки и добавляем через ссетер его в поле

        }
        if (e.getSource()==b4){
            text = text + b4.getText();//Та самая пустая переменная к которая добавляет числа = числу нажатий на кнопку
            f.setText(text);//Так же через геттер получаем текст кнопочки и добавляем через ссетер его в поле

        }
        if (e.getSource()==b3){
            text = text + b3.getText();//Та самая пустая переменная к которая добавляет числа = числу нажатий на кнопку
            f.setText(text);//Так же через геттер получаем текст кнопочки и добавляем через ссетер его в поле

        }
        if (e.getSource()==b2){
            text = text + b2.getText();//Та самая пустая переменная к которая добавляет числа = числу нажатий на кнопку
            f.setText(text);//Так же через геттер получаем текст кнопочки и добавляем через ссетер его в поле

        }
        if (e.getSource()==b1){
            text = text + b1.getText();//Та самая пустая переменная к которая добавляет числа = числу нажатий на кнопку
            f.setText(text);//Так же через геттер получаем текст кнопочки и добавляем через ссетер его в поле

        }
        if (e.getSource()==b0){
            text = text + b0.getText();//Та самая пустая переменная к которая добавляет числа = числу нажатий на кнопку
            f.setText(text);//Так же через геттер получаем текст кнопочки и добавляем через ссетер его в поле

        }
        if (e.getSource()==fl){
            text = text + fl.getText();//Та самая пустая переменная к которая добавляет числа = числу нажатий на кнопку
            f.setText(text);//Так же через геттер получаем текст кнопочки и добавляем через ссетер его в поле

        }
        if (e.getSource()==Del){
            text="";//Та самая пустая переменная к которая добавляет числа = числу нажатий на кнопку
            f.setText(text);//Так же через геттер получаем текст кнопочки и добавляем через ссетер его в поле

        }
        
        if (e.getSource()==ad){
            a = Float.parseFloat(text);//Приравниваем строку к числу
            f.setText(text+ad.getText());//Пишем плюсы
            text="";//Обнуляет
            z = '+';//Приравняли для проверки

        }
        if (e.getSource()==sub){
            a = Float.parseFloat(text);//Приравниваем строку к числу
            f.setText(text+sub.getText());//Пишем плюсы
            text="";//Обнуляет
            z = '-';//Приравняли для проверки

        }
        if (e.getSource()==eqw){
            a = Float.parseFloat(text);//Приравниваем строку к числу
            f.setText(text+eqw.getText());//Пишем плюсы
            text="";//Обнуляет
            z = '*';//Приравняли для проверки

        }
        if (e.getSource()==div){
            a = Float.parseFloat(text);//Приравниваем строку к числу
            f.setText(text+div.getText());//Пишем плюсы
            text="";//Обнуляет
            z = '/';//Приравняли для проверки

        }
        if (e.getSource()==result){
            if(z=='+'){
                b=Float.parseFloat(text);//Приравниваем второе число из поля
                //обратно числа в строку перевожу
                f.setText(String.valueOf(a+b));//ВЫВОДИМ РЕЗУЛЬТАТ
                text=String.valueOf(a+b);//Обнуляет
            }
            if(z=='-'){
                b=Float.parseFloat(text);//Приравниваем второе число из поля
                //обратно числа в строку перевожу
                f.setText(String.valueOf(a-b));//ВЫВОДИМ РЕЗУЛЬТАТ
                text=String.valueOf(a-b);//Обнуляет
            }
            if(z=='*'){
                b=Float.parseFloat(text);//Приравниваем второе число из поля
                //обратно числа в строку перевожу
                f.setText(String.valueOf(a*b));//ВЫВОДИМ РЕЗУЛЬТАТ
                text=String.valueOf(a*b);//Обнуляет
            }
            if(z=='/'){
                b=Float.parseFloat(text);//Приравниваем второе число из поля
                //обратно числа в строку перевожу
                f.setText(String.valueOf(a/b));//ВЫВОДИМ РЕЗУЛЬТАТ
                text=String.valueOf(a/b);//Обнуляет
            }

        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void windowClosing(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void windowClosed(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void windowActivated(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }
}
