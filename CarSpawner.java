using System.Collections;
using
System.Collections.Generic;
using UnityEngine;
public class CarSpawner : MonoBehaviour
{ public GameObject[] cars;
int carNo;
public float maxPos =
2.3f; float timer;
public float delayTimer;
// Use this for initialization
void Start () {
timer = delayTimer;
}
// Update is called once per frame
void Update () {
timer -=
Time.deltaTime;
if(timer<=0){
Vector3 carPos = new Vector3 (Random.Range (- 2.5f,
2.6f), transform.position.y, transform.position.z);
carNo = Random.Range (0, 7);
Instantiate (cars[carNo], carPos, transform.rotation); timer =
delayTimer;
}
}
}
