package application.controller;

public class ProdutoController {
    @Controller
    @RequestMapping("/Produto")
    public class LivroController {

        @Autowired
        private LivroRepository produtoRepo;

        @RequestMapping("/list")
        public String list(Model model) {
            model.addAttribute("livros", produtoRepo.findAll());
            return "list";
        }
    
}
