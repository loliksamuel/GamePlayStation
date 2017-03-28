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
    private List<Game_I> gameList = new ArrayList(3);
    Game_I gameSelected;
    Label lblGameCurr;
    Label lblGameCurrr;
    Label lblStatus;
    Button buttonSwitch;
    Button buttonLt;
    Button buttonRt;
    Button buttonUp;
    Button buttonDn;

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
        buttonLt = new Button();
        buttonRt = new Button();
        buttonUp = new Button();
        buttonDn = new Button();


        buttonSwitch.setLabel("Switch Game");
        buttonUp.setLabel("^");
        buttonLt.setLabel("<");
        buttonRt.setLabel(">");
        buttonDn.setLabel("\\/");

        buttonSwitch.setBounds(60, 30, 90, 30);// setting button position
        buttonUp.setBounds(80, 100, 30, 30);// setting button position
        buttonLt.setBounds(20 , 130, 30, 30);// setting button position
        buttonRt.setBounds(140, 130, 30, 30);// setting button position
        buttonDn.setBounds(80 , 160, 30, 30);// setting button position

        lblGameCurr.setBounds(20 , 50, 100, 30);// setting button position
        lblGameCurrr.setBounds(130 , 50, 150, 30);// setting button position
        lblStatus.setBounds(20 , 300, 300, 30);// setting button position

        setSize(300, 600);//frame size 300 width and 300 height
        setLayout(null);//no layout manager
        setVisible(true);//now frame will be visible, by default not visible

        this.setTitle("Play Station");
        //add buttons using add method
        add(buttonSwitch);
        add(buttonLt);
        add(buttonRt);
        add(buttonUp);
        add(buttonDn);
        add(lblGameCurr);
        add(lblGameCurrr);
        add(lblStatus);


        buttonSwitch.addActionListener((ActionListener) (e) -> {
            currIndex++;
            if (currIndex > 2)
                currIndex = 0;
            gameSelected = gameList.get(currIndex);
            String gameCurr = gameSelected.getName();
            lblGameCurrr.setText(gameCurr);
            lblStatus.setText("switched to "+gameCurr);

        });

        buttonUp.addActionListener((ActionListener) (e) -> {
            lblStatus.setText("up Clicked");
            gameSelected.executeUp();
        });

        buttonLt.addActionListener((ActionListener) (e) -> {
            lblStatus.setText("Lt Clicked");
            gameSelected.executeLt();
        });

        buttonRt.addActionListener((ActionListener) (e) -> {
            lblStatus.setText("Rt Clicked");
            gameSelected.executeRt();
        });

        buttonDn.addActionListener((ActionListener) (e) -> {
            lblStatus.setText("Dn Clicked");
            gameSelected.executeDn();
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        lblStatus.setText("Welcome...");
    }
}
