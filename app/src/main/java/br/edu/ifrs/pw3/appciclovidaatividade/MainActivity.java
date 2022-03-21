package br.edu.ifrs.pw3.appciclovidaatividade;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    /*
     Método chamado quando a atividade é criada.
     Ele é usado para executar tarefas de inicialização
     Fornece um objeto Bundle com o estado da atividade
     Após esse método chama o onStart()
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "método onCreate()");
    }
    @Override
    /*
     Método chamado quando sua atividade está se tornando visível.
     É seguido por onResume() se a atividade vai para o primeiro plano, ou por onStop() se a atividade se torna invisível
     */
    protected void onStart(){
        super.onStart();
        Log.d("MainActivity", "método onStart()");
    }
    @Override
    /*
     Método chamado quando a atividade é parada e chamado imediatamente antes de ser iniciada outra vez
    */
    protected void onRestart(){
        super.onRestart();
        Log.d("MainActivity", "método onRestart()");
    }
    @Override
    /*
       Método chamado quando a atividade está no primeiro plano
       Após esse método chama o onPause()
     */
    protected void onResume(){
        super.onResume();
        Log.d("MainActivity", "método onResume()");
    }
    @Override
    /*
      Método chamado quando a atividade não está mais no primeiro plano, porque outra atividade está reiniciando.
      A atividade seguinte não reinicia até que o código nesse método termine, logo ele precisa ser rápido.
      É seguido por onResume() se a atividade retorna para o primeiro plano, ou por onStop() se a atividade se torna invisível
     */
    protected void onPause(){
        super.onPause();
        Log.d("MainActivity", "método onPause()");
    }
    @Override
    /*
      Método chamado quando a atividade não está mais visível, o que acontece quando outra atividade a está cobrindo
      ou a atividade está sendo destruída.
      É seguido por onRestart() se a atividade fica visível outra vez, ou por onDestroy() se a atividade vai ser destruída.
     */
    protected void onStop(){
        super.onStop();
        Log.d("MainActivity", "método onStop()");
    }
    @Override
    /*Método chamado quando a atividade vai ser destruída ou está finalizada.*/
    protected void onDestroy(){
        super.onDestroy();
        Log.d("MainActivity", "método onDestroy()");
    }
}