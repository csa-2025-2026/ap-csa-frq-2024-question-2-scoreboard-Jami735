/*

# Answer close reading 1 questions here



# Answer close reading 2 questions here

*/

// Write the class below

private String teamone;
private String teamtwo;
private int scoreone;
private int scoretwo;
private boolean active;

public Scoreboard(String teamo, String teamt)
{
    teamone = teamo;
    teamtwo =  teamt;
    scoreone = 0;
    scoretwo = 0;
    active = true; 
}

public void recordPlay(int point)
{
    if (point == 0 )
    {
        if(active)
        {
            score += point;
        }
        else
        {
            scoretwo += point
        }
    }
    else
    {
        active = !active;
    }
}

public String getScore()
{
    String output = scoreone + " - " + scoretwo + " - " + active;
    return output;
}
