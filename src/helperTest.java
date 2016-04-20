/**
 * Created by yasha on 18.03.2016.
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Arc2D;
import javax.swing.*;

public abstract class helperTest extends JFrame implements ButtonModel
{
    public static int x = 0;

    public static void main(String[] args)
    {

        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {

                MainFrame frame = new MainFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new GridBagLayout());
                frame.setVisible(true);


                JButton but1 = new JButton("Температура");
                JButton but2 = new JButton("Давление");
                JButton but3 = new JButton("АЦП");
                JButton but4 = new JButton("Сброс");
                but4.setToolTipText("Сбросить данные");
                frame.add(but1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));
                frame.add(but2, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));
                frame.add(but3, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));
                frame.add(but4, new GridBagConstraints(3, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));
                JLabel pribor = new JLabel("ПРИБОР, АЦП");
                JLabel preobr = new JLabel("ПРЕОБРАЗОВАТЕЛЬ");
                frame.add(pribor, new GridBagConstraints(1, 1, 2, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));
                frame.add(preobr, new GridBagConstraints(3, 1, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));

                JLabel minprib =  new JLabel("min:",SwingConstants.RIGHT);
                JLabel maxprib = new JLabel("max:", SwingConstants.RIGHT);
                JLabel rprib = new JLabel("текущее:", SwingConstants.RIGHT);

                frame.add(minprib, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
                frame.add(maxprib, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
                frame.add(rprib, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));





                JTextField minpribor = new JTextField("0",7);
                JTextField maxpribor = new JTextField("0",7);
                JTextField raschpribor = new JTextField("0",7);

                frame.add(minpribor, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(0, 2, 0, 0), 0, 0));
                frame.add(maxpribor, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(0, 2, 0, 0), 0, 0));
                frame.add(raschpribor, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(0, 2, 0, 0), 0, 0));


                JLabel minpreob = new JLabel("min:", SwingConstants.RIGHT);
                JLabel maxpreob = new JLabel("max:", SwingConstants.RIGHT);
                JLabel rpreob=  new JLabel("текущее:", SwingConstants.RIGHT);
                frame.add(minpreob, new GridBagConstraints(2, 2, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
                frame.add(maxpreob, new GridBagConstraints(2, 3, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
                frame.add(rpreob, new GridBagConstraints(2, 4, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));


                JTextField minpreobr = new JTextField("0",7);
                JTextField maxpreobr = new JTextField("0",7);
                JTextField raschpreobr = new JTextField("0",7);

                frame.add(minpreobr, new GridBagConstraints(3, 2, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(0, 2, 0, 0), 0, 0));
                frame.add(maxpreobr, new GridBagConstraints(3, 3, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(0, 2, 0, 0), 0, 0));
                frame.add(raschpreobr, new GridBagConstraints(3, 4, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(0, 2, 0, 0), 0, 0));



                JButton but5 = new JButton("Рассчитать прибор, АЦП");
                JButton but6 = new JButton("Рассчитать преобразователь");
                //JButton but7 = new JButton("Рассчитать АЦП");

                frame.add(but5, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));
                frame.add(but6, new GridBagConstraints(3, 5, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));
               /* frame.add(but7, new GridBagConstraints(3, 5, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));*/
                JLabel yasha =  new JLabel("by Yasha 2016 ver. 1.02",SwingConstants.CENTER);
                frame.add(yasha, new GridBagConstraints(0, 6, 4, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));
                frame.pack();

                but1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent event) {
                        x = 1;
                        but1.setBackground(Color.MAGENTA);

                    }
                });
                but2.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent event)
                    {
                        x = 2;
                        but2.setBackground(Color.cyan);
                    }
                });
                but3.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent event)
                    {
                        x = 3;
                        but3.setBackground(Color.YELLOW);
                    }
                });
                but4.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent event)
                    {
                        x = 0;
                        minpribor.setText("0");
                        maxpribor.setText("0");
                        raschpribor.setText("0");
                        minpreobr.setText("0");
                        maxpreobr.setText("0");
                        raschpreobr.setText("0");
                        but1.setBackground(but5.getBackground());
                        but2.setBackground(but5.getBackground());
                        but3.setBackground(but5.getBackground());
                    }
                });




                but5.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent event)
                    {
                        try{
                        if (x == 1)
                        {
                            double pribMin = Double.parseDouble(minpribor.getText().trim());
                            double pribMax = Double.parseDouble(maxpribor.getText().trim());
                            double preobMin = Double.parseDouble(minpreobr.getText().trim());
                            double preobMax = Double.parseDouble(maxpreobr.getText().trim());
                            double preobRasch =  Double.parseDouble(raschpreobr.getText().trim());
                            double y =  (((preobRasch - preobMin)*(pribMax - pribMin)) / (preobMax - preobMin)) + pribMin;
                            raschpribor.setText(""+ y);
                        }
                        else if (x ==2)
                        {
                            double pribMin = Double.parseDouble(minpribor.getText().trim());
                            double pribMax = Double.parseDouble(maxpribor.getText().trim());
                            double preobMin = Double.parseDouble(minpreobr.getText().trim());
                            double preobMax = Double.parseDouble(maxpreobr.getText().trim());
                            double preobRasch =  Double.parseDouble(raschpreobr.getText().trim());
                            double z = ((preobRasch - preobMin)* (pribMax - pribMin))/ (preobMax - preobMin);
                            raschpribor.setText(""+ z);
                        }
                        else if (x == 3) {
                            double pribMin = Double.parseDouble(minpribor.getText().trim());
                            double pribMax = Double.parseDouble(maxpribor.getText().trim());
                            double preobMin = Double.parseDouble(minpreobr.getText().trim());
                            double preobMax = Double.parseDouble(maxpreobr.getText().trim());
                            double preobRasch = Double.parseDouble(raschpreobr.getText().trim());
                            double z = (preobRasch - preobMin) * pribMax / (preobMax - preobMin);
                            raschpribor.setText("" + z);
                        }
                        }
                        catch(Exception e)
                        {
                            //error message
                        }

                    }
                });
                but6.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent event)
                    {
                        try {
                            if (x == 1) {
                                double pribMin = Double.parseDouble(minpribor.getText().trim());
                                double pribMax = Double.parseDouble(maxpribor.getText().trim());
                                double preobMin = Double.parseDouble(minpreobr.getText().trim());
                                double preobMax = Double.parseDouble(maxpreobr.getText().trim());
                                double pribRasch = Double.parseDouble(raschpribor.getText().trim());

                                double c = (((pribRasch - pribMin) / (pribMax - pribMin)) * (preobMax - preobMin)) + preobMin;
                                raschpreobr.setText("" + c);
                            } else if (x == 2) {
                                double pribMin = Double.parseDouble(minpribor.getText().trim());
                                double pribMax = Double.parseDouble(maxpribor.getText().trim());
                                double preobMin = Double.parseDouble(minpreobr.getText().trim());
                                double preobMax = Double.parseDouble(maxpreobr.getText().trim());
                                double pribRasch = Double.parseDouble(raschpribor.getText().trim());

                                double q = ((pribRasch / (pribMax - pribMin)) * (preobMax - preobMin)) + preobMin;
                                raschpreobr.setText("" + q);
                            } else if (x == 3) {
                                double pribMin = Double.parseDouble(minpribor.getText().trim());
                                double pribMax = Double.parseDouble(maxpribor.getText().trim());
                                double preobMin = Double.parseDouble(minpreobr.getText().trim());
                                double preobMax = Double.parseDouble(maxpreobr.getText().trim());
                                double pribRasch = Double.parseDouble(raschpribor.getText().trim());

                                double q = (pribRasch * (preobMax - preobMin) / pribMax) + preobMin;
                                raschpreobr.setText("" + q);
                            }
                        }
                        catch(Exception e )
                        {
                            //error message
                        }
                    }
                });

            }
        });

    }
}
