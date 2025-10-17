// Pantalla del catálogo.

@Composable
fun CatalogScreen(viewModel: CatalogViewModel = viewModel()) {
    val products by viewModel.products.collectAsState()

    LazyColumn {
        items(products) { product ->
            Card(modifier = Modifier.padding(8.dp)) {
                Column(Modifier.padding(16.dp)) {
                    Text(text = product.name, style = MaterialTheme.typography.titleMedium)
                    Text(text = "$${product.price}", style = MaterialTheme.typography.bodyMedium)
                }
            }
        }
    }
}
// Añadir ruta a Screen.kt y NavHost