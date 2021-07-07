package co.in.nextgencoder.todotask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import co.in.nextgencoder.todotask.Model.Todo;

public class MainActivity extends AppCompatActivity {

    private EditText editTodo;
    private FirebaseAuth firebaseAuth;
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        databaseReference = FirebaseDatabase.getInstance().getReference();
        firebaseAuth = FirebaseAuth.getInstance();
        editTodo = findViewById(R.id.editTodo);
    }

    public void addTask(View view) {
        String task = editTodo.getText().toString().trim();
        DatabaseReference todoReference = databaseReference.child("User").child("Todo").child(firebaseAuth.getUid());
        String id = firebaseAuth.getUid();

        Todo todo = new Todo(id, task, false);
        todoReference.child("Task").push().setValue(todo);
    }
}