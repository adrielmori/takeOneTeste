import { string } from "yup";

export type Movie = {
    id: number;
    title: string;
    score: number;
    count: number;
    image: string;
    trailer: string;
    description: string;
}

export type Score ={
    comment: string;
    scoreUser: number;
    movieId: number;
    idUsuario: number;
}

//definição do tipo
export type MoviePage = {
    content: Movie[];
    last: boolean;
    totalPages: number;
    totalElements: number;
    size: number;
    number: number;
    first: boolean;
    numberOfElements: number;
    empty: boolean;
}
