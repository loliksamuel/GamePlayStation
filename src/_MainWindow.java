import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lolik on 2017-03-28.
 */
class _MainWindow extends Frame implements ActionListener {
    private int currIndex = 0;
    private List<Game_Abs> gameList = new ArrayList(3);
    Game_I gameSelected;
    Label lblGameCurr;
    Label lblGameCurrr;

    Button buttonSwitch;
    Button buttonRestartGame;
    Button buttonLt;
    Button buttonRt;
    Button buttonUp;
    Button buttonDn;
    Label lblScreen;
    public _MainWindow() {
        gameList.add(new GameFootball());
        gameList.add(new GameKarate());
        gameList.add(new GameRaceCar());
        initButtons();
    }

    private void initButtons() {

        lblGameCurr = new Label("current game : ");
        lblGameCurrr = new Label("Football");
        lblScreen = new Label("");
        buttonSwitch = new Button();
        buttonRestartGame = new Button();
        buttonLt = new Button();
        buttonRt = new Button();
        buttonUp = new Button();
        buttonDn = new Button();


        buttonSwitch.setLabel("Switch Game");
        buttonRestartGame.setLabel("Restart Game");
        buttonUp.setLabel("^");
        buttonLt.setLabel("<");
        buttonRt.setLabel(">");
        buttonDn.setLabel("\\/");

        buttonSwitch.setBounds      ( 20, 30, 100, 30);
        buttonRestartGame.setBounds (130, 30, 120, 30);

        buttonUp.setBounds          (110 , 100, 30, 30);// setting button position
        buttonLt.setBounds          (50 , 130, 30, 30);// setting button position
        buttonRt.setBounds          (170, 130, 30, 30);// setting button position
        buttonDn.setBounds          (110 , 160, 30, 30);// setting button position

        lblGameCurr.setBounds       ( 20 , 60 , 100, 30);// setting button position
        lblGameCurrr.setBounds      (130 , 60 , 120, 30);// setting button position
        lblScreen.setBounds         ( 10 , 200, 270, 180);// setting button position

        setSize(270, 400);//frame size 300 width and 300 height
        setLayout(null);//no layout manager
        setVisible(true);//now frame will be visible, by default not visible

        this.setTitle("Play Station");
        //add buttons using add method
        add(buttonSwitch);
        add(buttonRestartGame);
        add(buttonLt);
        add(buttonRt);
        add(buttonUp);
        add(buttonDn);
        add(lblGameCurr);
        add(lblGameCurrr);
        add(lblScreen);
        gameSelected = gameList.get(currIndex);

        buttonRestartGame.addActionListener((ActionListener) (e)->{
            gameSelected.restart();
            lblScreen.setText("restarting");

        });

        buttonSwitch.addActionListener((ActionListener) (e) -> {
            currIndex++;
            currIndex%=3;

            gameSelected = gameList.get(currIndex);
            String gameCurr = gameSelected.getName();
            lblGameCurrr.setText(gameCurr);
            this.setTitle("Play Station:"+gameCurr);
            lblScreen.setBackground(gameSelected.getColor());
            lblScreen.setText("switched to "+gameCurr);

        });

        buttonUp.addActionListener((ActionListener) (e) -> {
            lblScreen.setText(gameSelected.executeUp());

        });

        buttonLt.addActionListener((ActionListener) (e) -> {
            lblScreen.setText( gameSelected.executeLt());
        });

        buttonRt.addActionListener((ActionListener) (e) -> {
            lblScreen.setText(   gameSelected.executeRt());
        });

        buttonDn.addActionListener((ActionListener) (e) -> {
            lblScreen.setText( gameSelected.executeDn());
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        lblScreen.setText("Welcome...");
    }
}
