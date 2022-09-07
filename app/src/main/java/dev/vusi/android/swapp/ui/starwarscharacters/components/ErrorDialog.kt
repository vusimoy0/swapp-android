package dev.vusi.android.swapp.ui.starwarscharacters.components

import androidx.compose.material.AlertDialog
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import dev.vusi.android.swapp.R
import dev.vusi.android.swapp.ui.starwarscharacters.characterslistscreen.components.StarWarsCharacterListTestTags.TAG_ERROR_DIALOG

@Composable
fun ErrorDialog(
    modifier: Modifier = Modifier,
    error: String,
    dismissError: () -> Unit
) {
    AlertDialog(
        modifier = Modifier.testTag(TAG_ERROR_DIALOG),
        onDismissRequest = {
            dismissError()
        },
        confirmButton = {
            TextButton(onClick = { dismissError() }) {
                Text(text = stringResource(id = R.string.dialog_text_ok))
            }
        },
        title = { Text(text = stringResource(id = R.string.dialog_title_error)) },
        text = { Text(text = error) })
}