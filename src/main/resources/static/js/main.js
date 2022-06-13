
$(document).ready(function(){
	$('.table .editButton').on('click', function(event){
		event.preventDefault();
		var href = $(this).attr('href');
		$.get(href, function(serie, status){
			$('#IdEdit').val(serie.id);
			$('#nomeEdit').val(serie.nome);
			$('#descricaoEdit').val(serie.descricao);
		})
		
		$('#editModal').modal();
	});
	
	$('.table .delButton').on('click',function(event){
		event.preventDefault();
		var href = $(this).attr('href');
		$('#delModal #delId').attr('href',href)
		$('#delModal').modal();
	});
	
	
});