package com.example.eva1_9_scroll;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtVwMensaje;
    final String smostrar = "We revisit the construction of IND-CCA secure key encapsulation mechanisms (KEM) from public-key encryption schemes (PKE). We give new, tighter security reductions for several constructions. Our main result is a tight reduction for the security of the U⊥̸-transform of Hofheinz, Hövelmanns, and Kiltz (TCC'17) which turns OW-CPA secure deterministic PKEs into IND-CCA secure KEMs. This result is enabled by a new one-way to hiding (O2H) lemma which gives a tighter bound than previous O2H lemmas in certain settings and might be of independent interest. We extend this result also to the case of PKEs with non-zero decryption failure probability, partially non-injective PKEs, and non-deterministic PKEs. In addition, we analyze the impact of different variations of the U⊥̸-transform discussed in the literature on the security of the final scheme. We consider the difference between explicit (U⊥) and implicit (U⊥̸) rejection, proving that security of the former implies security of the latter. We show that the opposite direction holds if the scheme with explicit rejection also uses key confirmation. Finally, we prove that (at least from a theoretic point of view) security is independent of whether the session keys are derived from message and ciphertext (U⊥̸) or just from the message (U⊥̸m).";
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtVwMensaje = findViewById(R.id.txtVwMsj);
        txtVwMensaje.setText(smostrar);
    }
}
