using System.Collections;
using
System.Collections.Generic;
using UnityEngine;
public class EnemyDestroyer : MonoBehaviour {
// Use this for initialization
Void start(){
}
// Update is called once per frame
void Update () {
}
void OnCollisionEnter2D(Collision2D col)
{ if(col.gameObject.tag=="enemy
car"){
Destroy(col.gameObject);
}
}
}
