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
    Label lblStatus;
    public _MainWindow() {
        gameList.add(new GameFootball());
        gameList.add(new GameKarate());
        gameList.add(new GameRaceCar());
        initButtons();
    }

    private void initButtons() {

        lblGameCurr = new Label("current game : ");
        lblGameCurrr = new Label("Football");
        lblStatus = new Label("");
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

        buttonSwitch.setBounds(20, 30, 100, 30);
        buttonRestartGame.setBounds(130, 30, 120, 30);
        buttonUp.setBounds(80, 100, 30, 30);// setting button position
        buttonLt.setBounds(20 , 130, 30, 30);// setting button position
        buttonRt.setBounds(140, 130, 30, 30);// setting button position
        buttonDn.setBounds(80 , 160, 30, 30);// setting button position

        lblGameCurr.setBounds(20 , 60, 100, 30);// setting button position
        lblGameCurrr.setBounds(130 , 60, 120, 30);// setting button position
        lblStatus.setBounds(20 , 300, 500, 30);// setting button position

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
        add(lblStatus);
        gameSelected = gameList.get(currIndex);

        buttonRestartGame.addActionListener((ActionListener) (e) -> {
            gameSelected.restart();
            lblStatus.setText("restarting");

        });

        buttonSwitch.addActionListener((ActionListener) (e) -> {
            currIndex++;
            currIndex%=3;

            gameSelected = gameList.get(currIndex);
            String gameCurr = gameSelected.getName();
            lblGameCurrr.setText(gameCurr);
            this.setTitle("Play Station:"+gameCurr);
            this.setBackground(gameSelected.getColor());
            lblStatus.setText("switched to "+gameCurr);

        });

        buttonUp.addActionListener((ActionListener) (e) -> {
            lblStatus.setText(gameSelected.executeUp());

        });

        buttonLt.addActionListener((ActionListener) (e) -> {
            lblStatus.setText( gameSelected.executeLt());
        });

        buttonRt.addActionListener((ActionListener) (e) -> {
            lblStatus.setText(   gameSelected.executeRt());
        });

        buttonDn.addActionListener((ActionListener) (e) -> {
            lblStatus.setText( gameSelected.executeDn());
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        lblStatus.setText("Welcome...");
    }
}
