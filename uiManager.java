using System.Collections;
using System.Collections.Generic; using
UnityEngine;
using UnityEngine.UI;
public class uiManager : MonoBehaviour {
//public Button[] buttons; public
Button[] buttons; public Text
scoreText; bool gameOver;
int score;
public AudioManager am;
// Use this for initialization
void Start () { gameOver =
false; score = 0;
InvokeRepeating ("scoreUpdate", 7.5f, 0.8f);
}
// Update is called once per frame
void Update () {
scoreText.text = "SCORE: " + score;
}
void scoreUpdate(){
if (gameOver == false) { score
+= 1;
}
}
public void gameOverActivated()
{ gameOver = true;
foreach (Button button in buttons) { button.gameObject.SetActive(true);
}
}
public void Play()
{
Application.LoadLevel ("Levels");
}
public void Hard(){ Application.LoadLevel
("Level1");
}
public void Harder(){ Application.LoadLevel
("level2");
}
public void Pause()
{ if(Time.timeScale==1){
Time.timeScale = 0;
am.carSound.Play ();
}
else if(Time.timeScale==0)
{ Time.timeScale = 1;
am.carSound.Stop ();
}
}
public void Replay(){
Application.LoadLevel (Application.loadedLevel);
}
public void Menu()
{
Application.LoadLevel ("menuscene");
}
public void Exit()
{ Application.Quit ();
}
}
